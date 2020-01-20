package Employee_Package;

public class Address  {
	int pincode, houseNumber;
	String landMark;

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", houseNumber=" + houseNumber + ", landMark=" + landMark + "]";
	}
	public Address(int pincode, int houseNumber, String landMark) {
		super();
		this.pincode = pincode;
		this.houseNumber = houseNumber;
		this.landMark = landMark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	

}
