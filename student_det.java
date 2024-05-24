class student_det
{
int age,id;
String name;
student_det()
{
System.out.println("I AM DEFAULT CONSTRUCTOR");
}
student_det(int i,String s)
{
id=i;
name=s;
}
student_det(int x,int y,String z)
{
id=x;
age=y;
name=z;
}
void display()
{
System.out.println(id+name+age);
}
public static void main(String args[])
{
student_det s=new student_det();
student_det s1=new student_det(101,"harita");
student_det s2=new student_det(102,23,"harita");
s1.display();
s2.display();
}
}
