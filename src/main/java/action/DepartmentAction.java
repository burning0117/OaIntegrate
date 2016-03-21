package action;

import com.opensymphony.xwork2.ActionContext;
import domain.Department;
import service.DepartmentService;
import utils.DeleteMode;

import java.util.Collection;

/**
 * Created by burning on 2016/3/20.
 */
public class DepartmentAction extends BaseAction<Department>{
    private DepartmentService departmentService;
    public DepartmentService getDepartmentService() {
        return departmentService;
    }

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    public String getAllDepartment(){
        System.out.println(this.getModel());
        Collection<Department>departments=this.departmentService.getAllDepartment();
        ActionContext.getContext().put("departmentList",departments);
        Object action=ActionContext.getContext().getActionInvocation().getAction();
        action.getClass().getDeclaredFields();
        return listAction;
    }
    public String  deleteDepartment(){
        this.departmentService.deleteDepartment(this.getModel().getDid(),DeleteMode.DEL_PRE_RELEASE);
        return action2action;
    }

}
