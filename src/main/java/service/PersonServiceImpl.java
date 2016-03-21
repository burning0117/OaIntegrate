package service;

import dao.PersonDao;
import domain.Person;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
public class PersonServiceImpl implements PersonService {
    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    PersonDao personDao;

    public void savePerson(Person person) {
        this.personDao.savePerson(person);
    }

    public Person getPersonById(Serializable id) {
        return this.personDao.getPersonById(id);
    }
}
