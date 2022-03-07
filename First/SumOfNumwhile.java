package First;

public class SumOfNumwhile {

	public static void main(String[] args) {
		int num=113;
		int sum=0;
		if(num!=0)
			System.out.println("Enter non zero no");
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
