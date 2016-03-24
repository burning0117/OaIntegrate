package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Department;
import domain.Post;
import domain.User;
import org.springframework.beans.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.DepartmentService;
import service.PostService;
import service.UserService;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Set;

/**
 * Created by burning on 2016/3/22.
 */
@Controller("userAction")
@Scope("prototype")
public class UserAction extends BaseAction<User> {
    @Resource(name = "userService")
    private UserService userService;
    @Resource(name = "departmentService")
    private DepartmentService departmentService;
    @Resource(name = "postService")
    private PostService postService;
    private Long did;
    private Long[] pids;
    private String message;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public Long[] getPids() {
        return pids;
    }

    public void setPids(Long[] pids) {
        this.pids = pids;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getAllUser(){
        Collection<User> userList=this.userService.getAllUser();
        ActionContext.getContext().getValueStack().push(userList);
        return listAction;
    }
    public String addUI(){
        Collection<Department> departments=this.departmentService.getAllDepartment();
        ActionContext.getContext().put("departmentList", departments);
        Collection<Post> posts=this.postService.getAllPost();
        ActionContext.getContext().put("postList", posts);
        return addUI ;
    }
    public String add(){
        User user=new User();
        BeanUtils.copyProperties(this.getModel(), user);
        Department department=this.departmentService.getDepartmentById(this.did);
        user.setDepartment(department);
        Set<Post> posts=this.postService.getPostByIds(this.pids);
        user.setPosts(posts);
        this.userService.saveUser(user);
        return action2action;
    }
}
