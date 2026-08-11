package training;
import java.util.*;

class Student{
	int regNum;
	String name;
	int age;
	char gender;
	
	void setValues(int regNum,String name,int age,char gender) {
		this.regNum=regNum;
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
}

public class SchoolSystem {
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setValues(102,"netra", 12, 'f');
		System.out.println("Register number: "+s1.regNum+"\nName: "+s1.name+"\nAge: "+s1.age+"\nGender: "+s1.gender);
	}
}
