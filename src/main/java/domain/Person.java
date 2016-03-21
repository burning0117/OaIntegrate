package domain;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/17.
 */
public class Person implements Serializable{
    private Long pid;
    private String pname;

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
}
