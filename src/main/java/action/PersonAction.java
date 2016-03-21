package action;

import com.opensymphony.xwork2.ActionSupport;
import domain.Person;
import org.apache.struts2.ServletActionContext;
import service.PersonService;

/**
 * Created by burning on 2016/3/20.
 */
public class PersonAction extends ActionSupport {
    private PersonService personService;

    public PersonService getPersonService() {
        return personService;
    }

    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

    public String savePerson() {
        Person person = new Person();
        person.setPname("战五");
        this.personService.savePerson(person);
        return null;
    }

    public String getPerson() {
        Person person = this.personService.getPersonById(1L);
        ServletActionContext.getRequest().setAttribute("person",person);
        return "index";
    }
}
