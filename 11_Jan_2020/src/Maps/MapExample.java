package Maps;

import java.util.*;
import java.util.Map.Entry;


public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put(1,"Anusha");
		map.put(4, "Anu");
		map.put(3, "Rohini");
		map.put(7, "Suvarsha");
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			Map.Entry entry=(Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());

		}
		map.remove(4);
		System.out.println("Updated Map is:"+map);
	}

}
