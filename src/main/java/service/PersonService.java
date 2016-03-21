package service;

import domain.Person;

import java.io.Serializable;

/**
 * Created by burning on 2016/3/20.
 */
public interface PersonService {
    public void savePerson(Person person);
    public Person getPersonById(Serializable id);
}
