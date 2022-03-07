package First;
import java.util.*;
public class PrimeByUsingCounter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no");
	int num=sc.nextInt();
	int Counter=0;
	for(int i=2;i<=num-1;i++)
	{
		if(num%i==0)
		{
			Counter++;
			break;	
		}
	}
	if(Counter==0)
	{
		System.out.println("Prime");
	}
	else
		System.out.println("Non Prime");
	}

}
