package First;

public class Palindrome {

	public static void main(String[] args) {
int num=12131;
int num1=0;
int temp=num;
while(num>0)
{
	num1=num1*10+num%10;
	num=num/10;
}
if(temp==num)
	System.out.println("No is Palndrome");
else
	System.out.println("No Is Non Palindrome");
	}

}
