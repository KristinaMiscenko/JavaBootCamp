package sef.FinalActivity;
import sef.FinalActivity.Employee;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testEmployeeCreation1() {
		Employee test1 = new Employee("Test");
		assertEquals("Test", test1.getName());
	}
	
	public void testEmployeeCreation2() {
		Employee test2 = new Employee("Test", 25);
		assertEquals("Test", test2.getName());
		assertEquals(25, test2.getAge());
	}
	
	public void testEmployeeCreation3() {
		Employee test3 = new Employee("Ivan", 33);
		assertEquals("Ivan", test3.getName());
		assertEquals(33, test3.getAge());
	}
	
	public void testEmployeeCreation4() {
		Employee test4 = new Employee("Boss", 14, "Juice Generator");
		assertEquals("Boss", test4.getName());
		assertEquals(14, test4.getAge());
		assertEquals("Juice Generator", test4.getJobTitle());
	}
	
	public void testEmployeeCreation5() {
		Employee test5 = new Employee("Bill", 64, "CEO", "Microsoft");
		assertEquals("Bill", test5.getName());
		assertEquals(64, test5.getAge());
		assertEquals("CEO", test5.getJobTitle());
		assertEquals("Microsoft", test5.getCompany());
	}
	
	public void testThrowException(){
		
		try {
				testEmployeeCreation1();
				testEmployeeCreation2();
				testEmployeeCreation3();
				testEmployeeCreation4();
				testEmployeeCreation5();
		} catch (Exception e) {
			fail();
		}
		  catch (Error e) {
			fail();
		}
	}
}
