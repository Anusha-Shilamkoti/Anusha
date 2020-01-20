package InterfacePackage;


class AirAutomoblie implements Fly
{
	double speed=100;
	String modelName;
	void setModelName(String modelName){
		this.modelName=modelName;
	
	}
	String show(){
		return modelName;
	}
	@Override
// THis method is override from Fly class
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}
}
interface Fly{
	int maxspeed=80;
	int fly(int a);
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirAutomoblie at=new AirAutomoblie();
		at.setModelName("Airbus");
		System.out.println("Aeroplane Name is: "+at.show());
		System.out.println("Aeroplane flying with: "+at.fly(120));
		System.out.println("Aeroplane speed is: "+Fly.maxspeed);
		
		
	}

}
