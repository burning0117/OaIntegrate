package dao;

import domain.User;

import java.util.Collection;

/**
 * Created by burning on 2016/3/22.
 */
public interface UserDao<T> extends BaseDao<T>{
    public Collection<User> getUsers();
}
