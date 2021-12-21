package Assignment02;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Array_Deletion_Test {
	 	private Array_Deletion Array_Deletion_under_test ; 
	@Before
	public void setUp() throws Exception {
		Array_Deletion_under_test = new Array_Deletion();
	}
	
	@Test
	public void deletetest() {
		int [] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int[] expectedresult1= {1,2,3,4,5,6,7,8,9,10,11,12,13,-1};
		int [] expectedresult2= {1,2,3,4,5,6,7,8,9,10,11,12,13,-1};
		int[] result1 = Array_Deletion_under_test.delete(arr,0);
		int [] result2 = Array_Deletion_under_test.delete(arr, -2);
		Assert.assertArrayEquals(expectedresult1, result1);
		Assert.assertArrayEquals(expectedresult2, result2);
		Array_Deletion_under_test.display(arr);				
		
	}

}
