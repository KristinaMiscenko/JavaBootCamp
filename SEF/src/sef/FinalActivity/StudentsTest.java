package sef.FinalActivity;

import sef.FinalActivity.Students;
import junit.framework.TestCase;


public class StudentsTest extends TestCase {
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testStudents() {
		Students test1 = new Students("Student");
		assertEquals("Student", test1.getName());
		
		test1 = new Students("Student2", "School3");
		assertEquals("Student2", test1.getName());
		assertEquals("School3", test1.getSchoolName());
		
		test1.setName("Elvis");
		assertEquals("Elvis", test1.getName());
		
		test1.setSchoolName("MIT");
		assertEquals("MIT", test1.getSchoolName());
		
		
		assertEquals("I am study in university MIT", test1.introduce());
	}
}
