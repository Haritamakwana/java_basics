import java.util*;
class U1P6 
{
	public static void main(String m[])
	{
		int no;
		
		Scanner S=new Scanner(System.in);
		System.out.println("enter a no.of week day=");
		no=S.nextInt();
		
		switch(no)
		{
			case 1:
				System.out.println("sunday");
				break;
			case 2:
				System.out.println("monday");
				break;
			case 3:
				System.out.println("tuesday");
				break;
			case 4:
				System.out.println("wednesday");
				break;
			case 5:
				System.out.println("thursday");
				break;
			case 6:
				System.out.println("friday");
				break;
			case 7:
				System.out.println("saturday");
				break;
		}
	}
}


