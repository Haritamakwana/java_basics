class U1P3
{
	int rollno;
	String name;
	static String college="BCA";
	U1P3(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String m[])
	{
		U1P3 s1=new U1P3(111,"Harita");
		U1P3 s2=new U1P3(222,"Nishtha");
		s1.display();
		s2.display();
	}
}
