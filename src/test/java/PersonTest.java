import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	
	
	@Test
	public void testGetAge() {
	
		Person person = new Person("Lars","Pärre",55,'M');
		person.setAge(20);
		assertTrue(person.getAge()==20);
	}

	
	@Test
	public void testGetFirstName() {
	
		Person person = new Person();
		
		person.setFirstName("Anders");
		assertTrue(person.getFirstName()=="Anders");
	}
	
	@Test
	public void testGetLastName() {
	
		Person person = new Person();
		
		person.setLastName("Orre");
		assertTrue(person.getLastName()=="Orre");
	}

	@Test
	public void testGetGender() {
	
		Person person = new Person();
		
		person.setGender('m');
		assertTrue(person.getGender()=='m');
	}
	
}