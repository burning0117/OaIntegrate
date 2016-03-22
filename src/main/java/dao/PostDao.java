package dao;

import domain.Post;

import java.util.Set;

/**
 * Created by burning on 2016/3/22.
 */
public interface PostDao<T> extends BaseDao<T>{
    public Set<Post> getPostsByIds(Long []pids);
}
