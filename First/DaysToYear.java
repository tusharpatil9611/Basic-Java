// Write a program to convert days to year.
package First;
public class DaysToYear {

	public static void main(String[] args) {
		int num=9150;
		int years =num/365;
		int rem1 =num%365;
		System.out.println("Years");
		System.out.println(years);
		//int num2=rem1;
		int month=rem1/30;
		int rem2=rem1%30;
		System.out.println("Months");
		System.out.println(month);
		int num3=rem2;
		int weeks=num3/7;
		int Days=num3%7;
		System.out.println("weeks");
		System.out.println(weeks);
		System.out.println("Days");
		System.out.println(Days);
		double num4=Days;
		double hours=num4/24;
		double rem4=num4%24;
		System.out.println("Hours");
		System.out.println(hours);
		System.out.println("min");
		System.out.println(rem4);
	
		
	}

}
