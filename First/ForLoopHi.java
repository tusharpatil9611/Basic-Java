package First;

import java.util.Scanner;

public class ForLoopHi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no");
	int  no=sc.nextInt();
		for( int i=1;i<=2;i=i)
		{
			System.out.println("Hi");
		}

		for(int i=2;i<=20;i=i+2)
		{
		System.out.println(i);	
		}
		for(int i=1;i<=10;i++)
		{
			System.out.println("Table is="+(no*i));
		}

	}

}
