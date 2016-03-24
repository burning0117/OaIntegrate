package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Department;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.DepartmentService;
import utils.DeleteMode;

import javax.annotation.Resource;
import java.util.Collection;

/**
 * Created by burning on 2016/3/20.
 */
@Controller("departmentAction")
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{
    @Resource(name = "departmentService")
    private DepartmentService departmentService;
    private String dname;
    private String description;

    public String getAllDepartment(){
        Collection<Department> departmentList = this.departmentService.getAllDepartment();
        System.out.println(departmentList+"111111111");
        ActionContext.getContext().put("departmentList",departmentList);
        Object action = ActionContext.getContext().getActionInvocation().getAction();
        action.getClass().getDeclaredFields();
        return listAction;
    }
    public String deleteDepartment(){
        this.departmentService.deleteDepartmentById(this.getModel().getDid(), DeleteMode.DEL_PRE_RELEASE);
        return action2action;
    }
    public String addUI(){
        return addUI;
    }
    public String add(){
        Department department = new Department();
        BeanUtils.copyProperties(this.getModel(), department);
        this.departmentService.saveDepartment(department);
        return action2action;
    }
    public String updateUI(){
        Department department = this.departmentService.getDepartmentById(this.getModel().getDid());
        ActionContext.getContext().getValueStack().getRoot().add(0,department);
        return updateUI;
    }
    public String update(){
        Department department = this.departmentService.getDepartmentById(this.getModel().getDid());
        BeanUtils.copyProperties(this.getModel(), department);
        this.departmentService.updateDepartment(department);
        return action2action;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
