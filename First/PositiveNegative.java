package First;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No to Check ");
	int no=sc.nextInt();
	if(no<0)
		System.out.println("No is Negative No ");
	else if(no>0)
		System.out.println("No is Positive No");
	else
		System.out.println("No is Zero");

	}

}
