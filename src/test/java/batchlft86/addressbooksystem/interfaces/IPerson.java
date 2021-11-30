package batchlft86.addressbooksystem.interfaces;

import batchlft86.addressbooksystem.entity.Person;

public interface IPerson {

	public void addNewPerson(Person person);
	
	public void updatePerson(Person person);
	
	public Person getPersonByName(String firstName);
	
	public void deleteByName(String firstName);
	
}
