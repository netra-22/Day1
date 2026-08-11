package training;

class StudentReportCard{
	int rollNum;
	String name;
	int m1;
	int m2;
	int m3;
	int total;
	float avg;
	String grade;
	
	StudentReportCard(int rollNum,String name,int m1,int m2,int m3){
		this.rollNum=rollNum;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		calc();
	}
	
	void calc() {
		total=m1+m2+m3;
		avg=total/3;
		if(avg>=90) 
			grade="A";
		else if(avg>80) 
			grade="B";
		else if(avg>70) 
			grade="C";
		else if(avg>60) 
			grade="D";
		else if(avg>50) 
			grade="E";
		else
			grade="F";
	}
	
	void getDetails() {
		System.out.println("Roll Number: "+rollNum+"\nName: "+name+"\nMark1: "+m1+"\nMark2: "+m2+"\nMaark3: "+m3+"\nTotal: "+total+"\nAverage: "+avg+"\nGrade: "+grade);
		System.out.println();
	}
}

public class StudentReportCardSystem {

	public static void main(String[] args) {
		StudentReportCard s1=new StudentReportCard(102,"Netra",89,75,60);
		s1.getDetails();
		
		StudentReportCard s2=new StudentReportCard(023,"Tara",99,89,95);
		s2.getDetails();

	}

}
