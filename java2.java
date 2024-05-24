import java.io.*;
import java.util.*;
class demo
{
	int a,b;
	void display(int x)
	{
		System.out.println("single argument="+x);
	}
	void display(int x,int y)
	{
		a=x+y;
		System.out.println("single argument="+a);
	}
	void display(int x,int y,int z)
	{
		b=x+y+z;
		System.out.println("single argument="+b);
	}
}
class java2
{
	public static void main(String args[])
	{
		demo d1=new demo();
		d1.display(10);
		d1.display(10,20);
		d1.display(10,20,30);
	}
}