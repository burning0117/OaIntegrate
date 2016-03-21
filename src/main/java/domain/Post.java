package domain;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by burning on 2016/3/17.
 */
public class Post implements Serializable{
    private Long pid;
    private String pname;
    private String description;

    public Set<User> getUsers() {
        return users;
    }

    private Set<User> users;


    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
