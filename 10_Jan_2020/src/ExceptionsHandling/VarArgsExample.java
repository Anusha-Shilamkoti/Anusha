package ExceptionsHandling;

public class VarArgsExample {
	
	static void add(Integer... values){
		int s=0;
		System.out.println("add method invoked");
		for(Integer i:values){
			s=s+i;
			
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(3,4);
		add(5,5,3,4);

	}

}
