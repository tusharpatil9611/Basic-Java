
package First;

import java.util.Scanner;

public class EvenOddScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the NO ");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("The Given No is Even ");
		}
		else
		{
			System.out.println("The NO is Odd");
		}
	}

}
