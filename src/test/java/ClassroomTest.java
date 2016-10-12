import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
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
		
		PrintStream originalOut = System.out;
		
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		
		Classroom room = new Classroom();
		Student student2 = new Student("Malle", "Kalle",25,'f');
		Student student3 = new Student("Nalle", "Talle",45,'m');
		room.addANewStudent(student2);
		room.addANewStudent(student3);
		
		room.removeAStudent("Malle");
		assertTrue(os.toString().contains("removed!"));
		
		room.removeAStudent("Malle");
		assertTrue(os.toString().contains("exist!"));
		
		System.setOut(originalOut);
		
		/*assertEquals(room.getStudents().get(0).getFirstName(),"Malle");
		room.removeAStudent("Malle");
		assertFalse(room.getStudents().contains(student2));
		room.removeAStudent("Malle");*/
	}

	
	@Test
	public void testPrintFullRelatory() {
		
		ArrayList<Student> studentArray = new ArrayList<Student>();
		Classroom classroom2 = new Classroom("TEST15", "Spring 16", studentArray);
		Student student1 = new Student("Rafael", "Silva", 20, 'M', 3.1, 5.4, 6.2);
		classroom2.addANewStudent(student1);
		
		
		PrintStream originalOut = System.out;
		
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		
		
		classroom2.printFullRelatory();
		
		assertTrue(os.toString().contains("Classroom name: "));
		
		
		/*room.printFullRelatory();
		
		String name = os.toString();
		assertEquals(name,os.toString());
		assertTrue(os.toString().contains("Student: "));
		*/
		System.setOut(originalOut);
	}
	
	

}
