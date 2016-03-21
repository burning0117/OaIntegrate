package dao;

import domain.Person;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

    public void savePerson(Person person) {
        this.getHibernateTemplate().save(person);
    }

    public Person getPersonById(Serializable id) {
        Person person= (Person) this.getHibernateTemplate().load(Person.class,1L);
        return person;
    }
}
