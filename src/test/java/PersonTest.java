import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Person;

public class PersonTest {

	Person p = new Person("Rafael","Silva",30,'M');
	
	@Test
	public void testFirstName(){
		//Person p = new Person("Rafael","Silva",30,'M');
		Person p2 = new Person();
		p.setFirstName("julian");
		assertEquals(p.getFirstName().equals("julian"),true);
		assertEquals(p.getFirstName(),"julian");
		assertTrue(p.getFirstName().equals("julian"));
		//assertTrue(p.getFirstName() == "julian");
		
	}
	
	@Test
	
	public void testAge(){
		p.setAge(20);
		assertEquals(p.getAge(),20);
	}
	
	@Test
	public void testLastName(){
		p.setLastName("Anders");
		assertEquals(p.getLastName(),"Anders");
	}
	
	@Test
	public void testGender(){
		p.setGender('M');
		assertEquals(p.getGender(),'M');
	}


}
