package service;

import domain.Post;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * Created by burning on 2016/3/22.
 */
public interface PostService {
    public Collection<Post> getAllPost();
    public void updatePost(Post post);
    public void savePost(Post post);
    public void deletePost(Serializable id);
    public Post getPostById(Serializable id);
    public Set<Post> getPostByIds(Long[] pids);
}
