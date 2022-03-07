
package First;

import java.util.Scanner;

public class IffElseAnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First no ");
		int num1=sc.nextInt();
		System.out.println("Enter the Second No ");
		int num2=sc.nextInt();
		System.out.println("Enter the Third No ");
		int num3=sc.nextInt();
		if(num1<num2&&num1<num3)
		{
			System.out.println("Num 1 is Smaller="+num1);
		}
		else if(num2<num1&&num2<num1)
		{
			System.out.println("Num 2 is the Smallest ="+num2);
		}
		else
		{
			System.out.println("Num 3 is Smallest ="+num3);
		}
	}

}
