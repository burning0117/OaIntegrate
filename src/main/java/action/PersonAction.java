package action;

import domain.Person;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.PersonService;

import javax.annotation.Resource;

/**
 * Created by burning on 2016/3/20.
 */
@Controller("personAction")
@Scope("prototype")
public class PersonAction extends BaseAction<Person>{
    @Resource(name = "personService")
    private PersonService personService;
    public String savePerson() {
        Person person = new Person();
        person.setPname("战五");
        this.personService.savePerson(person);
        return "index";
    }

    public String getPerson() {
        Person person = this.personService.getPersonById(1L);
        ServletActionContext.getRequest().setAttribute("person",person);
        return "index";
    }
}
