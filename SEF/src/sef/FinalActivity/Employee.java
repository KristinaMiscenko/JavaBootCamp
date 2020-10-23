package sef.FinalActivity;

public class Employee{

	private int age;
    private double salary;
    private String name;
    private String jobTitle;
    private String company;
    
    public Employee(String name) {
    	this.name = name;
    }
    
    public Employee(String name, int age) {
    	this.name = name;
    	this.age = age;
    }
    
    public Employee(String name, int age, String jobTitle) {
    	this.name = name;
    	this.age = age;
    	this.jobTitle = jobTitle;
    }
    
    public Employee(String name, int age, String jobTitle, String company) {
    	this.name = name;
    	this.age = age;
    	this.jobTitle = jobTitle;
    	this.company = company;
    }
    

    public Employee(String name, int age, String jobTitle, String company, double salary) {
    	this.name = name;
    	this.age = age;
    	this.jobTitle = jobTitle;
    	this.company = company;
    	this.salary = salary;
    }
    
  
    public void setAge(int age) {
        this.age = age;    
    }
   
    
    public int getAge() {
        return this.age;    
    }
    
    
    public void setName(String name) {
        this.name = name;    
    }
    
   
    public String getName() {    
        return this.name;    
    }
    

    public void setJobTitle(String jobTitle) {
    	this.jobTitle = jobTitle;
    }
    
    
    public String getJobTitle() {
    	return this.jobTitle;
    }
    
   
    public void setCompany(String company) {
    	this.company = company;
    }
    
   
    public String getCompany() {
    	return this.company;
    }
    
    
    public void setSalary(double salary) {
    	this.salary = salary;
    }
    
    
    public double getSalary() {
    	return this.salary;
    }
    
    
    public String introduce() {
    	return "My name is " + name + " and i am " + age + "years old" +
    			"I am work as " + jobTitle + " in " + company;
    }
}

