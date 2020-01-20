package Assignment1;

public class Ship extends AutoMoble implements Swim{
	String shipName;
	int shipNo;
	public Ship(String shipName, int shipNo) {
		super();
		this.shipName = shipName;
		this.shipNo = shipNo;
	}
	
	@Override
	String show() {
		// TODO Auto-generated method stub
		return shipName;
	}
	

}
