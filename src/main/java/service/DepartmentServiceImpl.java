package service;

import dao.DepartmentDao;
import domain.Department;
import utils.DeleteMode;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by burning on 2016/3/19.
 */
public class DepartmentServiceImpl implements DepartmentService {
    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    DepartmentDao departmentDao;

    public void saveDepartment(Department department) {
        this.departmentDao.saveEntry(department);
    }

    public void updateDepartment(Department department) {
        this.departmentDao.updateEntry(department);
    }

    public void deleteDepartment(Serializable id, String deleteMode) {
        this.departmentDao.deleteDepartment(id, deleteMode);
    }

    public Collection<Department> getAllDepartment() {
        return this.departmentDao.getAllDepartment();
    }

    public Department getDepartmentById(Serializable id) {
        return this.departmentDao.getDepartmentById(id);
    }
}
