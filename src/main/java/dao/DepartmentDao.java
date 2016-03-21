package dao;

import domain.Department;
import utils.DeleteMode;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by burning on 2016/3/19.
 */
public interface DepartmentDao {
    public void saveDepartment(Department department);
    public void updateDepartment(Department department);
    public void deleteDepartment(Serializable id, String deleteMode);
    public Collection<Department> getAllDepartment();
    public Department getDepartmentById(Serializable id);
}
