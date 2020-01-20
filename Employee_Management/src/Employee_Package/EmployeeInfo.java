package Employee_Package;

import java.util.ArrayList;

public class EmployeeInfo implements Comparable<EmployeeInfo> {
	int empId, empSalary;
	String empName, location;
	//Address add;
	
	@Override
	public int compareTo(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		return emp.compareTo(emp.empId);
	}
	
public static void main(String args[]){
	ArrayList<EmployeeInfo> e1=new ArrayList<EmployeeInfo>();
	e1.add(new EmployeeInfo(234, 200000, "Anusha", "chennai"));
	e1.add(new EmployeeInfo(123, 456878, "Anu", "hyd"));
	e1.add(new EmployeeInfo(24145, 76778, "Praveen","Hyderabad"));
	e1.add(new EmployeeInfo(6543, 78759, "Rohini", "chennai"));
	
}

Collections.sort(e1);
for(EmployeeInfo emp:e1){
	System.out.println(emp);
}
	@Override
	public String toString() {
		return "EmployeeInfo [empId=" + empId + ", empSalary=" + empSalary + ", empName=" + empName + ", location="
				+ location + ", address=" + add + "]";
	}

	public EmployeeInfo(int empId, int empSalary, String empName, String location) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.location = location;
		//this.add = add;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int packageSalary() {
		return empSalary *= 12;
	}

	
	

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub EmployeeInfo e=new EmployeeInfo(1001,20000,"Anusha","Chennai");
	 * System.out.println("Employee Id: "+e.getEmpId());
	 * System.out.println("Employee Name: "+e.getEmpName());
	 * System.out.println("Employee Salary: "+e.getEmpSalary()
	 * +"\nTotal Package of Salary is:"+e.packageSalary()); }
	 */
}
