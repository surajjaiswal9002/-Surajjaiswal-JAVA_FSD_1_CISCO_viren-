package FileHandling;

public class Student  implements java.io.Serializable
{
	private int stuRollNum;
	private int stuAge;
	private String stuName;
	private String stuAddress;
	private int stuHight;
	
	
	public Student(int stuRollNum, int stuAge, String stuName, String stuAddress, int stuHight)
	{
		this.stuRollNum = stuRollNum;
		this.stuAge = stuAge;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuHight = stuHight;
	}


	public int getStuRollNum() {
		return stuRollNum;
	}


	public void setStuRollNum(int stuRollNum) {
		this.stuRollNum = stuRollNum;
	}


	public int getStuAge() {
		return stuAge;
	}


	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuAddress() {
		return stuAddress;
	}


	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}


	public int getStuHight() {
		return stuHight;
	}


	public void setStuHight(int stuHight) {
		this.stuHight = stuHight;
	}
	

}


