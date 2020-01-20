package LamdaExpressions;

public class LamdaEx {
	interface adding{
		int add(int a,int b);
	}
	interface Sayable
	{
		String say(String message);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*adding d=(a,b)->(a+b);
		System.out.println(d.add(10,20));*/
		/*adding d=(int a,int b)->{
			return (a+b);
		};
		System.out.println(d.add(10,20));*/
		Sayable s=(message)->{
			String str1="Hi chennai";
			String str2=str1+message;
			return str2;
		};
		System.out.println(s.say("welcome"));
		}
	}


