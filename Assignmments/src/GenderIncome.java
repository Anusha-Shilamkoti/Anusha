import java.util.Scanner;

public class GenderIncome {

	public static void main(String[] args) {
		
	String gender,name;
	double income;
	//int s=0;
	
		// TODO Auto-generated method stub
	System.out.println("Enter your Gender, Name, Inclome:");
	Scanner s=new Scanner(System.in);
	gender=s.nextLine();
	name=s.nextLine();
	income=s.nextDouble();
	//if(gender=="others" || gender=="other" || gender=="general"){
	//	System.out.println("Please enter valid Gender!");
	//}
	if(gender=="Male" || gender=="male" || gender=="others"){
		if(income>=0 && income<=180000){
			System.out.println("Mr."+name+" No Tax for Your Income ");
		}
		else if(income>=180001 && income<=500000){
			System.out.println("Mr."+name+" 10% Income tax you should pay i.e "+income/10);
		}
		else if(income>=500001 && income<=800000){
			System.out.println("Mr."+name+" 20% income tax you should pay i.e "+income/20);
		}
		else{
			System.out.println("Mr."+name+" 30% income tax you should pay i.e "+income/30);
		}
	}
	else{
		if(income>=0&&income<=190000)
			System.out.println("Ms."+name+" No Tax for Your Income ");
		else if(income>=190001 && income<=500000)
			System.out.println("Ms."+name+" 10% Income tax you should pay i.e "+income/10);
		else if(income>=500001 && income<=800000)
			System.out.println("Ms."+name+" 20% income tax you should pay i.e "+income/20);
		else
			System.out.println("Ms."+name+" 30% income tax you should pay i.e "+income/30);
	}

	}

}
