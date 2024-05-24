class Demo
{
	int a,b;
	void display(int x)
	{
		System.out.println("single argument="+x);

	}
	void display(int x,int y)
	{
		a=x+y;
		System.out.println("two argument="+a);
	}
	void display(int x,int y,int z)
	{
		b=x+y+z;
		System.out.println("three arguments="+b);
	}
}
class U1P2
{
	public static void main(String m[])
	{
		Demo d1=new Demo();
		d1.display(10);
		d1.display(10,20);
		d1.display(10,20,30);
	}
}

	