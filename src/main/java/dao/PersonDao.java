package dao;

import domain.Person;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
public interface PersonDao {
    public void savePerson(Person person);
    public Person getPersonById(Serializable id);
}
