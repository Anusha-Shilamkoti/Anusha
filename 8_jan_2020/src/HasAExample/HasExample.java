package HasAExample;

class Engine{
	int engineNumber, age;
	String fuelType;
	public Engine(int engineNumber, int age, String fuelType) {
		super();
		this.engineNumber = engineNumber;
		this.age = age;
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Engine [engineNumber=" + engineNumber + ", age=" + age + ", fuelType=" + fuelType + "]";
	}
	public int getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(int engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
}
class Car{
	Engine e;
	int carNumber;
	String carModel;
	@Override
	public String toString() {
		return "Car [e=" + e + ", carNumber=" + carNumber + ", carModel=" + carModel + "]";
	}
	public Car(Engine e, int carNumber, String carModel) {
		super();
		this.e = e;
		this.carNumber = carNumber;
		this.carModel = carModel;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
}



public class HasExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(new Engine(10, 9, "Petrol"), 0416, "BMW");
		System.out.println(c);

	}

}
