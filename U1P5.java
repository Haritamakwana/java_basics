class Student
{
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
class U1P5
{
	public static void main(String m[])
	{
		Student s1=new Student(111,"Harita",50000);
		Student s2=new Student(222,"Nishtha",60000);
		s1.display();
		s2.display();
	}
}
