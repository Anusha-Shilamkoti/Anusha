package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(new Employee(1001, 23, "Anusha"));
		al.add(new Employee(2001, 22, "Anu"));
		al.add(new Employee(1050, 21, "Rohini"));
		al.add(new Employee(1000, 27, "Praveen"));
		System.out.println("Sorting By Name:");
		Collections.sort(al, new NameComparator());
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			Employee emp=(Employee) itr.next();
			System.out.println(emp.empId+" "+emp.empName+" "+emp.empAge);
		}
		System.out.println("Sorting by Age:");
		Collections.sort(al, new AgeComparator());
		Iterator itr1=al.iterator();
		while(itr1.hasNext()){
			Employee emp1=(Employee) itr1.next();
			System.out.println(emp1.empId+" "+emp1.empName+" "+emp1.empAge);
		}
	}

}
