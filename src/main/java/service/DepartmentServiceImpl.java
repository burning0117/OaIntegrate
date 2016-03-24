package service;

import dao.DepartmentDao;
import domain.Department;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by burning on 2016/3/19.
 */
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Resource(name = "departmentDao")
    DepartmentDao departmentDao;

    public void saveDepartment(Department department) {
        this.departmentDao.saveEntry(department);
    }

    public void updateDepartment(Department department) {
        this.departmentDao.updateEntry(department);
    }

    public void deleteDepartmentById(Serializable id, String deleteMode) {
        this.departmentDao.deleteDepartmentById(id, deleteMode);
    }

    public Collection<Department> getAllDepartment() {
        return this.departmentDao.getAllDepartment();
    }

    public Department getDepartmentById(Serializable id) {
        return this.departmentDao.getDepartmentById(id);
    }
}
