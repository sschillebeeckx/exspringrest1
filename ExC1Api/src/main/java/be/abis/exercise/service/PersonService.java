package be.abis.exercise.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import be.abis.exercise.exception.PersonCanNotBeDeletedException;
import be.abis.exercise.exception.PersonNotFoundException;
import be.abis.exercise.model.Person;

public interface PersonService {
	
	ArrayList<Person> getAllPersons();
    Person findPerson(int id) throws PersonNotFoundException;
    Person findPerson(String emailAddress, String passWord) throws PersonNotFoundException;
    void addPerson(Person p) throws IOException;
    void deletePerson(int id) throws PersonCanNotBeDeletedException;
    void changePassword(Person p, String newPswd) throws IOException;
	List<Person> findPersonsByCompanyName(String compName);

}
