package ExceptionsHandling;

import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0;
		try{
			System.out.println(a/b);//Unchecked Exception
			
		throw new ArithmeticException();
			
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally always excute");
		}
		System.out.println("my Program is excuted");
	}

}
