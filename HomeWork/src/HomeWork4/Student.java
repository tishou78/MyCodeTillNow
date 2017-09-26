package HomeWork4;

public class Student {
	String name;
	String subject;
	float grade;
	int yearInCollege;
	short age;
	boolean isDegree;
	double money;
	
	Student(){
		grade = 4;
		yearInCollege = 1;
		
	}
	Student(String name, String subject, short age, boolean isDegree, double money ){
		this();
		name = "Null";
		subject = "math";
		age = 17;
		money = 0;
		
	}
	Student(String name, String subject,float grade, int yearInCollege, short age,boolean isDegree, double money){
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.yearInCollege = yearInCollege;
		this.age = age;
		this.isDegree = isDegree;
		this.money = money;
	}
	void upYear(){
		if(yearInCollege < 4){
			yearInCollege += 1;
			
		}else{
			isDegree = true;
			
		}
		return;
	}

	double	receiveScholarship(double	min,	double	amount){
		if(grade > min && age < 30) {
			money += amount;
		}
		return money;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", grade=" + grade + ", yearInCollege="
				+ yearInCollege + ", age=" + age + ", isDegree=" + isDegree + ", money=" + money + "]";
	}

}
