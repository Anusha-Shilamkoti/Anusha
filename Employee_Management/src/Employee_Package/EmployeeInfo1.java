package Employee_Package;

public class EmployeeInfo1 extends EmployeeInfo {

	int numbers, hours;

	@Override
	public String toString() {
		return "EmployeeInfo numbers=" + numbers + ", hours=" + hours + ", empId=" + empId + ", empSalary=" + empSalary
				+ ", empName=" + empName + ", location=" + location;
	}

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public EmployeeInfo1(int empId, int empSalary, String empName, String location, int numbers, int hours, Address add) {
		super(empId, empSalary, empName, location, add);
		this.numbers = numbers;
		this.hours = hours;
		this.add=add;

		// TODO Auto-generated constructor stub
	}

	int calculateSalary() {
		return numbers * empSalary * hours;

	}

}
