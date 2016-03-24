package dao;

import domain.Person;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
@Repository("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao<Person>{
    public void savePerson(Person person) {
        this.saveEntry(person);
    }

    public Person getPersonById(Serializable id) {
        return this.getEntryById(id);
    }
}
