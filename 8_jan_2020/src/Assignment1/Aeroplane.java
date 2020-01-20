package Assignment1;

public class Aeroplane extends AutoMoble implements Fly {
	String aeroName;
	int aeroNo;
	public Aeroplane(String aeroName, int aeroNo) {
		super();
		this.aeroName = aeroName;
		this.aeroNo = aeroNo;
	}
	
	@Override
	String show() {
		// TODO Auto-generated method stub
		return aeroName;
	}
}
