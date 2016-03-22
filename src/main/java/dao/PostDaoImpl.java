package dao;

import domain.Post;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by burning on 2016/3/22.
 */
@Repository("postDao")
public class PostDaoImpl extends BaseDaoImpl<Post> implements PostDao<Post> {
    public Set<Post> getPostsByIds(Long[] pids) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("from Post").append(" where pid in(");
        for (int i = 0; i < pids.length; i++) {
           if (i<pids.length-1){
               stringBuffer.append(pids[i]+",");
           }else {
               stringBuffer.append(pids[i]);
           }
        }
        stringBuffer.append(")");
        List<Post> postList=this.hibernateTemplate.find(stringBuffer.toString());
        return new HashSet<Post>(postList);
    }
}
