package First;

public class PrimeNonPrime {

	public static void main(String[] args) {
		int num=79;
		boolean isNo=true;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
				isNo=false;
			break;
		}
if(isNo==true)
	System.out.println("Prime");
else
	System.out.println("Not Primer");
	}

}
