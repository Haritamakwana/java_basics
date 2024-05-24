import java.io.*;
import java.util.*;
class box
{
	int length , breadth , height ;
	box()
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter length");
		length=S.nextInt();
		System.out.println("enter breadth");
		breadth=S.nextInt();
		System.out.println("enter height");
		height=S.nextInt();
	}
	void display()
	{
		int volume=length*breadth*height;
		System.out.println("Volume of box is=" +volume);
	}
}
class java1
{
	public static void main(String args[])
	{
		box b1=new box();
		b1.display();
		box b2=new box();
		b2.display();
	}
}