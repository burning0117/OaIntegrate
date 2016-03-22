package dao;

import domain.Department;
import domain.User;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * Created by burning on 2016/3/19.
 */
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao<Department> {
    public void saveDepartment(Department department) {
        this.saveEntry(department);
    }

    public void updateDepartment(Department department) {
        this.updateEntry(department);
    }

    public void deleteDepartment(Serializable id, String deleteMode) {
        Department department = this.getDepartmentById(id);
        if ("del".equals("deleteMode.DEL")) {
            this.deleteEntry(department);
        } else if ("del_pre_release".equals("deleteMode.DEL_PRE_RELEASE")) {
            Set<User> users = department.getUsers();
            for (User user : users) {
                user.setDepartment(null);
            }
        } else {

        }
        this.deleteEntry(department);
    }

    public Collection<Department> getAllDepartment() {
        return this.getAllEntry();
    }

    public Department getDepartmentById(Serializable id) {
        return this.getEntryById(id);
    }
}
