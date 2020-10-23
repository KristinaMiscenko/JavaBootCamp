package sef.FinalActivity;

public class Students {
	
		 private String name;
		 private String schoolName;
		 
		 public Students(String name) {
			 this.name = name;
		 }
		 
		 public Students(String name, String schoolName) {
			 this.name = name;
			 this.schoolName = schoolName;
		 }
		 
		 public void setName(String name) {
			 this.name = name;
		 }
		 
		 public String getName() {
			 return this.name;
		 }
		 
		 public void setSchoolName(String schoolName) {
			 this.schoolName = schoolName;
		 }
		 
		 public String getSchoolName() {
			 return this.schoolName;
		 }
		 
		
		 public String introduce() {
			 return "I am study in university " + schoolName;
		 }
	}


