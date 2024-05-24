import java.util.*;
import java.lang.*;
class parent
{
	String color="white";
	parent()
	{
		System.out.println("it is parent class constructor");
	}
	void display()
	{
		System.out.println("it  is display() from parent class");
	}	
}
class child extends parent
{
	String color="black";
	child()
	{
		super();
		System.out.println("it is child class constructor");
	}
	void display()
	{
		super.display();
		System.out.println("it is display() from child class");	
		System.out.println(color);
		System.out.println(super.color);
		super.color="pink";
		System.out.println(super.color);
	}

}
class practice3
{
	public static void main(String args[])
	{
	child obj=new child();
	obj.display();
	}
}
