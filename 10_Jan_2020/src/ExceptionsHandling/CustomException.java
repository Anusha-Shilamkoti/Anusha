package ExceptionsHandling;

class InvalidgetException extends Exception{
	InvalidgetException(String s)
	{
		super(s);
	}
	
}

public class CustomException {
	static void validate(int age)throws InvalidgetException{
		if(age<18)
		throw new InvalidgetException("not Eligible");
		else
			System.out.println("Welcome to VOte");
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try {
			validate(20);
			
		}catch(Exception e){
			System.out.println("Exception Occured"+e);
		}
		System.out.println("Rest of code..");
		}
		
	}


