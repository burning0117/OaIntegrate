package test;

import domain.Department;
import org.junit.Test;
import service.DepartmentService;

import java.util.Collection;

/**
 * Created by burning on 2016/3/19.
 */
public class DepartmentTest extends BaseSpring{
    @Test
    public void testQuery(){
        DepartmentService departmentService= (DepartmentService) context.getBean("departmentService");
        Collection<Department> departmentList=departmentService.getAllDepartment();
    }
}
