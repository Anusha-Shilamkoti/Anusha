package OverloadingPackage;

class Addition{
	int add(int a, int b){
		return a+b;
	}
	double add(double a, int b){
		return a+b;
	}
	double add(double a, double b){
		return a+b;
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		Addition a=new Addition();
		System.out.println(a.add(2,3)+"\n"+a.add(2.5, 5)+"\n"+a.add(6.7, 2.5));
		// TODO Auto-generated method stub

	}

}
