package Collections;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> e=new ArrayList<String>();
		e.add("a");
		e.add("b");
		e.add("c");
		ArrayList<String> e1=new ArrayList<String>();
		System.out.println(e);
		e1.add("e");
		e1.add("f");
		e1.add("g");
		System.out.println(e1);
		e.addAll(e1);
		System.out.println(e);
		e.retainAll(e);
		System.out.println(e);
		e.removeAll(e);
		System.out.println(e);
		e.clear();
		System.out.println(e);
		e.retainAll(e);
		System.out.println(e.retainAll(e1));
		System.out.println(e1.size());
		//Se.ret
		System.out.println();
	}
			
}
