package Employee_Package;

import java.util.*;

public class CollectionsExample implements Comparable<CollectionsExample> {
	int empId, empSalary;
	String empName, location;
	// Address add;

	public CollectionsExample(int empId, int empSalary, String empName, String location) {
		super();
		this.empId = empId;
		this.empSalary = empSalary;
		this.empName = empName;
		this.location = location;
	}

	@Override
	public int compareTo(CollectionsExample emp) {
		// TODO Auto-generated method stub
		return this.empId - emp.empId;
	}

	public static void main(String args[]) {
		ArrayList<CollectionsExample> e1 = new ArrayList<CollectionsExample>();
		e1.add(new CollectionsExample(200, 200000, "Anusha", "chennai"));
		e1.add(new CollectionsExample(300, 456878, "Anu", "hyd"));
		e1.add(new CollectionsExample(150, 76778, "Praveen", "Hyderabad"));
		e1.add(new CollectionsExample(125, 78759, "Rohini", "chennai"));

		Collections.sort(e1);
		for (CollectionsExample emp : e1) {
			System.out.println(emp.empId + " " + emp.empName + " " + emp.empSalary + " " + emp.location);
		}
	}
}
