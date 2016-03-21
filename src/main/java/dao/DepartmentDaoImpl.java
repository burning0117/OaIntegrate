package dao;

import domain.Department;
import domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * Created by burning on 2016/3/19.
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
    public void saveDepartment(Department department) {
        this.getHibernateTemplate().save(department);
    }

    public void updateDepartment(Department department) {
        this.getHibernateTemplate().update(department);
    }

    public void deleteDepartment(Serializable id, String deleteMode) {
        Department department = this.getDepartmentById(id);
        if ("del".equals("deleteMode.DEL")) {
            this.getHibernateTemplate().delete(department);
        } else if ("del_pre_release".equals("deleteMode.DEL_PRE_RELEASE")) {
            Set<User> users = department.getUsers();
            for (User user : users) {
                user.setDepartment(null);
            }
        } else {

        }
        this.getHibernateTemplate().delete(department);
    }

    public Collection<Department> getAllDepartment() {
        return this.getHibernateTemplate().find("from Department");
    }

    public Department getDepartmentById(Serializable id) {
        return (Department) this.getHibernateTemplate().get(Department.class, id);
    }
}
