package service;

import dao.PersonDao;
import domain.Person;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Resource(name = "personDao")
    PersonDao personDao;

    public void savePerson(Person person) {
        this.personDao.savePerson(person);
    }

    public Person getPersonById(Serializable id) {
        return this.personDao.getPersonById(id);
    }
}
