abstract class Shape
{ abstract void show();
}
class Rectangle extends Shape
{
void show()
{
System.out.println ("you are gian");
}
}
class Test
{
public static void main (String M[])
{
Shape s1=new Rectangle(); //Reference
s1.show();
}
}