package First;
import java.util.*;
public class Wovel {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Char ");
	char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='u')
	{
		System.out.println("THis is A vowel");
	}
	else
	{
		System.out.println("This is Consonent");
	}

	}

}
