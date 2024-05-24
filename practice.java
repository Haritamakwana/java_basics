class a
{
int no1;
String name;
void get()
{
no1=100;
name="harita";
}
}
class b extends a
{
int no2;
void put()
{
no2=500;
}
}
class c extends b
{
void display()
{
System.out.println(no1);
System.out.println(no2);
System.out.println(name);
}
}
class practice
{
public static void main(String args[])
{
c obj=new c();
obj.get();
obj.put();
obj.display();
}
}