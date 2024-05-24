class U1P4
{
	int id,age;
	String name;
	U1P4()
	{
		System.out.println("I am default constructor");
	}
	U1P4(int i,String n)
	{
		id=i;
		name=n;
	}
	U1P4(int x,String y,int z)
	{
		id=x;
		name=y;
		age=z;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String m[])
	{
		U1P4 s=new U1P4();
		U1P4 s1=new U1P4(101,"Harita");
		U1P4 s2=new U1P4(102,"Nishtha",20);
		s1.display();
		s2.display();
	}
}
		