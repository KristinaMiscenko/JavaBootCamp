package sef.FinalActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPerson() {
		Person test1 = new Person("Test");
		assertEquals("Test", test1.getFirstName());

		test1 = new Person("Test1234", 255);
		assertEquals("Test1234", test1.getFirstName());
		assertEquals(255, test1.getAge());
		
		try {
			test1.setFirstName("Ivan");
		} catch (Exception e) {
			fail();
		}
		assertEquals("Ivan", test1.getFirstName());
		
		try {
			test1.setSecondName("TheTerrible");
		} catch (Exception e) {
			fail();
		}

		assertEquals("TheTerrible", test1.getSecondName());
		
		test1.setAge(25);
		assertEquals(25, test1.getAge());
		
		
		assertEquals("My name is Ivan", test1.introduce());
		assertEquals("My name is Ivan and i am 25 years old", test1.introduceAge());
		
		
		try {
			test1.setFirstName("Ivan1337");
		} catch (Exception e) {
			assertEquals("First name contains digits", e.getMessage());
		}
		assertFalse("Ivan1337 is not set?", test1.getFirstName().equals("Ivan1337"));
		
		try {
			test1.setFirstName("TheTerribleTerrible228");
		} catch (Exception e) {
			assertEquals("First name contains digits", e.getMessage());
		}
		assertFalse("TheTerribleTerrible228 is not set?", test1.getSecondName().equals("TheTerribleTerrible228"));
	}
	
}
