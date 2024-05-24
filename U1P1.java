class Box
{
	int length,breadth,height;
	Box(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
	}
	void display()
	{
		int volume=length*breadth*height;
		System.out.println("volume of box is="+volume);
	}
}
class U1P1
{
	public static void main(String m[])
	{
		Box b1=new Box(10,20,30);
		Box b2=new Box(100,200,300);
		b1.display();
		b2.display();
	}
}