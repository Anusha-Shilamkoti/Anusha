import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Year:");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%4==0 && n%400==0){
			System.out.println(n+" Year is Leap Year");
	}
		else
			System.out.println(n+" year is Not a Leap Year");

}
}
