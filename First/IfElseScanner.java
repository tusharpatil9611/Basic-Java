package First;
import java.util.Scanner;
public class IfElseScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No to View Day");
		int no=sc.nextInt();
		if(no==1)
		{
			System.out.println("The Day is Monday");
		}
		else if(no==2)
		{
			System.out.println("Day is Tuesday");
		}
		else if(no==3)
		{
			System.out.println("Day is Wensday");
		}
		else if(no==4)
		{
			System.out.println("Day is Thursday");
		}
		else if(no==5)
		{
			System.out.println("Day is Friday");
		}
		else if(no==6)
		{
			System.out.println("Day is Saturday");
		}
		else
		{
			System.out.println("Invalid inout Plz enter valid no");
		}
	}

}
