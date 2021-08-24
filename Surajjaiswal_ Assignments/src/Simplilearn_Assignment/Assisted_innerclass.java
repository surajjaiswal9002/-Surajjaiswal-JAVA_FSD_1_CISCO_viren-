package Simplilearn_Assignment;

public class Assisted_innerclass {

private String msg="Inner Classes";

 void display(){  
	 class Inner{  
		 void msg(){
			 System.out.println(msg);
		 }  
  }  
  
  Inner l=new Inner();  
  l.msg();  
 }  

 
public static void main(String[] args) {
	Assisted_innerclass  ob=new Assisted_innerclass();  
	ob.display();  
	}
}


