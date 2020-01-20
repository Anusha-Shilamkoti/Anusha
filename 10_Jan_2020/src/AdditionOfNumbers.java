import java.util.Scanner;

public class AdditionOfNumbers {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int n = 0, c = 0;
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		//for(a=n;a>=0;a=0) {
			while (a != 0) {
				// c=a%10;
				// n=n+c;
				// c=a/10;
				// a=a/10;
				n = n + a % 10;
				a = a / 10;
			}

			System.out.println(n);
			a = n;
		//}
		//System.out.println(a);
	}

}
