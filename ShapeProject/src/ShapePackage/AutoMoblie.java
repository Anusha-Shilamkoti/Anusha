package ShapePackage;

class Car{
	int carNumber;
	int  run(){
		return 60;
	}
}

class Fordcar extends Car{
	int run(){
		return super.run()+40;
	}
	
}
public class AutoMoblie{
	
	public static void main(String[] args) {
		Fordcar f=new Fordcar();
		System.out.println(f.run());
		// TODO Auto-generated method stub

	}

}
