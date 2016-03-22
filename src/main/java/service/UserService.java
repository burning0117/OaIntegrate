package service;

import domain.User;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by burning on 2016/3/22.
 */
public interface UserService {
    public Collection<User> getAllUser();
    public User getUserById(Serializable id);
    public void saveUser(User user);
    public void updateUser(User user);
}
