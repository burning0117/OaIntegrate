package service;

import dao.PostDao;
import domain.Post;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 * Created by burning on 2016/3/22.
 */
@Service("postService")
public class PostServiceImpl implements PostService{
    @Resource(name = "postDao")
    private PostDao postDao;
    public Collection<Post> getAllPost() {
        return this.postDao.getAllEntry();
    }
    @Transactional(readOnly = false)
    public void updatePost(Post post) {
        this.postDao.updateEntry(post);
    }
    @Transactional(readOnly = false)
    public void savePost(Post post) {
        this.postDao.saveEntry(post);
    }

    @Transactional(readOnly = false)
    public void deletePost(Serializable id) {
        this.postDao.deleteEntry(id);
    }

    public Post getPostById(Serializable id) {
        return (Post) this.postDao.getEntryById(id);
    }

    public Set<Post> getPostByIds(Long[] pids) {
        return this.postDao.getPostsByIds(pids);
    }
}
