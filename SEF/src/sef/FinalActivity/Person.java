package sef.FinalActivity;

public class Person{
		
	private String firstName;
	private String secondName;
	private int age;
		
	public Person(String firstName) {		
		this.firstName = firstName;
	}
	
	public Person(String firstName, int age) {
		this.firstName = firstName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) throws Exception {
		for (char c : firstName.toCharArray()) {
			if (Character.isDigit(c))
			{
				throw new Exception("First name contains digits");
			}
		}
		
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) throws Exception {
		for (char c : secondName.toCharArray()) {
			if (Character.isDigit(c))
			{
				throw new Exception("Second name contains digits");
			}
		}
		
		this.secondName = secondName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public String introduce(){
		return "My name is " + firstName;
	}
	
	
	public String introduceAge() {
		return "My name is " + firstName + " and i am " + age + " years old";
	}	
}
