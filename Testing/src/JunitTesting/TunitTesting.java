package JunitTesting;

import static org.junit.Assert.*;
//import static org.junit.Assert.*;  
//import com.javatpoint.logic.*;
import org.junit.Test;

public class TunitTesting  {  
	//public static void main(String args[]){
		  
	    @Test  
	    public void testFindMax(){  
	        assertEquals(4,TestingExample.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,TestingExample.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  
	}
	//}  

