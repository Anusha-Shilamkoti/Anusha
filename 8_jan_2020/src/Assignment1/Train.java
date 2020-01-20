package Assignment1;

public class Train extends AutoMoble implements Runable {
	int trainNo;
	String trainName;
	public Train(int trainNo, String trainName) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
	}
	
	@Override
	String show() {
		// TODO Auto-generated method stub
		return trainName;
	}
}
