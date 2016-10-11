import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.*;

public class ClassroomTest {

	ArrayList<Student> studentList = new ArrayList<Student>();
	
	Classroom classroom = new Classroom("Class14", "Spring15", studentList);
	
	@Test
	public void testGetClassroomName() {
		
		Classroom room = new Classroom();
		room.setClassroomName("Class17");
		assertEquals(room.getClassroomName(),"Class17");
	}
	
	@Test
	public void testGetClassroomTerm() {
		
		Classroom room = new Classroom();
		room.setClassroomTerm("Spring17");
		assertEquals(room.getClassroomTerm(),"Spring17");
	}
	
	@Test
	public void testGetStudents() {
		
		Classroom room = new Classroom();
		room.setStudents(studentList);
		assertEquals(room.getStudents(),studentList);
		//Student student2 = new Student("Malle", "Kalle",25,'f');
		//room.setStudents(studentList);
		//room.addANewStudent(student2);
		
	}
	
	
	@Test
	public void testAddStudents() {
		//ArrayList<Student> studentList2 = new ArrayList<Student>();
		Classroom room = new Classroom();
		Student student2 = new Student("Malle", "Kalle",25,'f');
		room.addANewStudent(student2);
		assertEquals(room.getStudents().get(0).getFirstName(),"Malle");
	}
	
	@Test
	public void testRemoveAStudent() {
		
		Classroom room = new Classroom();
		Student student2 = new Student("Malle", "Kalle",25,'f');
		room.addANewStudent(student2);
		//assertNotNull(room.removeAStudent("Malle"));
		
		//assertEquals("Malle",student2.getFirstName());
		room.removeAStudent("Malle");
		//assertEquals("Mapple",student2.getFirstName());
		room.removeAStudent("Mapple");
	}

	/*
	@Test
	public void testPrintFullRelatory() {
		
		Classroom room = new Classroom();
		String name = room.printFullRelatory();
		System.out.println(name);
		assertTrue(room.printFullRelatory().contains("Classroom name:"));
		
	}
	*/
	

}
