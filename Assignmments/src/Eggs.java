import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter No. of Eggs: ");
		int num,n=0,left,r=0;
		int gross=144;
		int dozan=12;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
			
				r=num%gross;
				left=num/gross;
				System.out.print(left+" Gross,");
			if(r>=12){
				n=r%dozan;
				r=r/dozan;
			}
			else
			{
				
			}
			System.out.print(n+" Dozans, "+n);
		

	}

}
