package test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.Person;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by burning on 2016/3/23.
 */
@Repository("testServlet")
@Scope("prototype")
public class TestServlet extends ActionSupport implements ModelDriven<Person>{
    @Resource(name = "person")
    private Person person;
    public String test(){
        return "success";
    }
    public Person getModel() {
        return person;
    }
}
