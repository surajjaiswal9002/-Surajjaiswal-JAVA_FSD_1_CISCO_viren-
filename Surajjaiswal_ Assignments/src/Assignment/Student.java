package Assignment;

public class Student 
{
	String name;
	int age;
	char  gender,section ;
	float math ,science,english,total_mark,percentage;
	
	Student(String name,int age,char gender,char section,float math,float science,float english)
	{
		this.name = name;
		this.age=age;
		this.gender=gender;
		this.section=section;
		this.math=math;
		this.science=science;
		this.english=english;
		
	}
	Student(String name,int age,char gender,char section,float science,float english)
	{
		this.name = name;
		this.age=age;
		this.gender=gender;
		this.section=section;
		this.science=science;
		this.english=english;
	}
	
	void display()
	{
		System.out.println("- Name "+name+ " Total Mark ="+(total_mark=math+science+english)+" Percentage = "+total_mark/300*100);
		
	}
	

	public static void main(String[] arg)
	{
	
		Student s1 = new Student("Rishabh", 23, 'M', 'A', 65,  87f, 76.5f);
		Student s2 = new Student("Xavier",  25, 'M', 'B',      76.5f, 88f);
		Student s3 = new Student("Munmun",  24, 'M', 'c',      56.5f, 76f);
		Student s4 = new Student("Albart",  22, 'M', 'A', 67f, 78f, 98f);
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		

	}
}

