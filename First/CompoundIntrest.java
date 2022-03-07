package First;

public class CompoundIntrest {

	public static void main(String[] args) {
		int p=10000;
		double r=10;
		int n=12;
		int y=5;
double a=1+(r/(n*100));
System.out.println(a);
int b=n*y;
System.out.println(b);
double amount=p*Math.pow(a, b);
System.out.println(amount);

}
}