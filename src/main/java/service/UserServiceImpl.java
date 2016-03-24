package service;

import dao.UserDao;
import domain.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by burning on 2016/3/22.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao")
    private UserDao userDao;

    public Collection<User> getAllUser() {
        return this.userDao.getAllEntry();
    }

    @Transactional(readOnly = false)
    public User getUserById(Serializable id) {
        return (User) this.userDao.getUsers();
    }

    public void saveUser(User user) {
        this.userDao.saveEntry(user);
    }

    @Transactional(readOnly = false)
    public void updateUser(User user) {
        this.userDao.updateEntry(user);
    }
}
