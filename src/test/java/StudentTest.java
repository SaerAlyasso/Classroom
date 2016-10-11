import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	
	@Test
	public void testGetFirstGrade(){
		Student student = new Student();
		student.setFirstGrade(5.0);
		assertTrue(student.getFirstGrade()==5.0);
	}
	
	
	@Test
	public void test
	
	@Test
	public void testCalculateAverage() {
		Student student = new Student();
		
		assertEquals(student.calculateAverage(5.0, 5.0, 5.0),5.0,0.0);
	}

	
	@Test
	public void testHasClearedTheCourse(){
		
		Student student = new Student();
		
		//assertEquals(student.hasClearedTheCourse(),true);
		assertEquals(student.hasClearedTheCourse(),false);
	}
}
