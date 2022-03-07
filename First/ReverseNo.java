package First;

public class ReverseNo {

	public static void main(String[] args) {
		int num=5466;
		int num1=0;
		while(num>0){
			num1=num1*10+num%10;
			num=num/10;
		}
System.out.println(num1);
	}

}
