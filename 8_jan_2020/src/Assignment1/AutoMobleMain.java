package Assignment1;

public class AutoMobleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeroplane ae=new Aeroplane("AirBus", 1001);
		System.out.println("Aeroplane Name: "+ae.show()+"\nAreoplane Number: "+ae.aeroNo+"\nAeroplane Speed: "+Aeroplane.speed);
		Train tr=new Train(1002, "Chennai");
		System.out.println("Train Name: "+tr.show()+"\nTrain Number: "+tr.trainNo+"\nTrain Speed: "+Train.trainSpeed);
		Ship s=new Ship("Titanic", 1003);
		System.out.println("Ship Name: "+s.show()+"\nShip Number: "+s.shipNo+"\nShip Speed: "+Ship.swimSpeed);

	}

}
