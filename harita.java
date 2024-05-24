interface abc
{
	void print();
}
class xyz
{
	void show()
	{
	System.out.println("i am from class");
	}
}
class harita extends xyz implements abc
{
	public void print()
	{
	System.out.println("i am from interface");
	}
	public static void main(String args[])
	{
	harita obj=new harita();
	obj.print();
	obj.show();
	}
}