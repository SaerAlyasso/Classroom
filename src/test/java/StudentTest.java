import static org.junit.Assert.*;

import org.junit.Test;

import otherclasses.Student;

public class StudentTest {

	Student student = new Student("Anders", "Borg",55,'m',5.0,5.0,5.0);
	Student student2 = new Student("Malle", "Kalle",25,'f');
	Student student3 = new Student();
	
	/*@Test
	public void testStudentCreation(){
	Student student = new Student("Anders", "Borg",55,'m',5.0,5.0,5.0);
	Student student2 = new Student("Malle", "Kalle",25,'f');
	
	}*/
	
	@Test
	public void testGetFirstGrade(){
		Student student4 = new Student();
		student4.setFirstGrade(5.0);
		assertEquals(student4.getFirstGrade(),5.0,0.0);
	}
	
	@Test
	public void testGetSecondGrade(){
		Student student5 = new Student();
		student5.setSecondGrade(5.0);
		assertEquals(student5.getSecondGrade(),5.0,0.0);
	}
	
	@Test
	public void testGetThirdGrade(){
		Student student6 = new Student();
		student6.setThirdGrade(5.0);
		assertEquals(student6.getThirdGrade(),5.0,0.0);
	}
	
	@Test
	public void testSetAverage(){
		Student student7 = new Student();
		student7.setAverageGrade(5.0);
		assertEquals(student7.getAverageGrade(),5.0,0.0);
	}
	
	@Test
	public void testCalculateAverage() {
		//student = new Student();
		
		assertEquals(student.calculateAverage(5.0, 5.0, 5.0),5.0,0.0);
	}

	@Test
	public void testCalculateAverage2(){
		
		assertEquals(student.calculateAverage(10.0),6.6,0.1);
		
		
	}
	
	@Test
	public void testCalculateAverage3() {
		
		Student student8 = new Student();
		student8.setSecondGrade(10.0);
		student8.setFirstGrade(10.0);
		student8.setThirdGrade(10.0);
		
		assertEquals(student8.calculateAverage(),10.0,0.0);
	}
	@Test
	public void testHasClearedTheCourse(){
	
		student.setAverageGrade(10.0);
		
		assertTrue(student.hasClearedTheCourse());
		
		student.setAverageGrade(5.0);
		
		assertFalse(student.hasClearedTheCourse());
		
	}
	
	@Test
	
	public void testToString(){
		
		Student student9 = new Student("Kalle", "Borgen",25,'m',5.0,5.0,5.0);
		String name = student9.toString();
		assertTrue(name.contains("Student: "));
		
		
		Student student10 = new Student("Olle", "ziczac",25,'m',7.0,7.0,7.0);
		String name2 = student10.toString();
		assertTrue(name2.contains("Student: "));
		
	}
}
