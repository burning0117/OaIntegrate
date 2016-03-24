package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Post;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.PostService;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by burning on 2016/3/22.
 */

@Controller("postAction")
@Scope("prototype")
public class PostAction extends BaseAction<Post>{
    @Resource(name = "postService")
    private PostService postService;

    public String getAllPost(){
        Collection<Post> postList=this.postService.getAllPost();
        ActionContext.getContext().put("postList",postList);
        return listAction;
    }
    public String addUI(){
        System.out.println("aaaaaa");
        return addUI;
    }
    public String add(){
        Post post=new Post();
        BeanUtils.copyProperties(this.getModel(), post);
        this.postService.savePost(post);
        return action2action;
    }
    public String delete(){
        this.postService.deletePost(this.getModel().getPid());
        return action2action;
    }
    public String updateUI(){
        Post post=this.postService.getPostById(this.getModel().getPid());
        ActionContext.getContext().getValueStack().pop();
        ActionContext.getContext().getValueStack().push(post);
        return updateUI;
    }
    public String update(){
        Post post=this.postService.getPostById(this.getModel().getPid());
        BeanUtils.copyProperties(this.getModel(), post);
        this.postService.updatePost(post);
        return action2action;
    }
}
