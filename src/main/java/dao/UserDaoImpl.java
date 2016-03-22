package dao;

import domain.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Created by burning on 2016/3/22.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao<User>{
    public Collection<User> getUsers() {
        List<User> userList=this.hibernateTemplate.find("from User u left join  fetch u.department d left  join  fetch  u.posts p");
        return new HashSet<User>(userList);
    }
}
