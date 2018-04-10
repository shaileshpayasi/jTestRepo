package za.co.sanlam.epsilon.utils;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Util {

		@Before
	    public void setUp() {
			
	    }
	    private int add() {

			int a=10;
			int b=20;
			int c=a+b;
			return c;
		}
	    private int sub() {

	 		int a=30;
	 		int b=20;
	 		int k=a-b;
	 		return k;
	 	}
		@After
	    public void tearDown() {
	    }
	    @Test
	    public void testAdd() {
	    	int expectedResult=30;
	    
	    	Util util=new Util();
	    	int d=util.add();
	  
	    	assertEquals(expectedResult, d);
	    	
	     
	    }

	    @Test
	    public void testSub() {
	    	
	    	int expectedResult1=10;
	    	Util util=new Util();
	    	
	   int e=util.sub();
	    	
	    	assertEquals(expectedResult1, e);
	     
	    }
	}



