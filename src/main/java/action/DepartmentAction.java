package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Department;
import org.springframework.beans.BeanUtils;
import service.DepartmentService;
import utils.DeleteMode;

import java.util.Collection;

/**
 * Created by burning on 2016/3/20.
 */
/*departmentAction为action层，实现了
*查询所有、删除
*
*
* */
public class DepartmentAction extends BaseAction<Department>{
    private DepartmentService departmentService;
    Department department=new Department();
    public DepartmentService getDepartmentService() {
        return departmentService;
    }
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    public String getAllDepartment(){
        System.out.println(this.getModel());
        Collection<Department> departmentList = this.departmentService.getAllDepartment();
        Object action = ActionContext.getContext().getActionInvocation().getAction();
        action.getClass().getDeclaredFields();
        return listAction;
    }
    public String deleteDepartment(){
        //this.departmentService.deleteDepartmentById(this.getModel().getDid(), DeleteMode.DEL_PRE_RELEASE);
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
        //this.departmentService.updateDeparment(department);
        return action2action;
    }
}
