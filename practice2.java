import java.util.*;
class practice2
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter name,age,salary");
	String name=obj.nextLine();
	int age=obj.nextInt();
	double salary=obj.nextDouble();
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("salary:"+salary);	
}
}