package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Full_Array_Test {
	private Full_Array Full_Array_under_test;
	@Before
	public void setUp() throws Exception {
		Full_Array_under_test  = new Full_Array(); 
	}

	
	@Test
	public void fullarraytest() { 
		
		int []arr = {25,2,24,5,60};
		Full_Array_under_test.setsize(arr,5);
		Assert.assertEquals(true, Full_Array_under_test.linearSearch(2));
		Assert.assertEquals(false, Full_Array_under_test.linearSearch(50));
		
		Full_Array_under_test.delete(24);
		Full_Array_under_test.display();
		
		Full_Array_under_test.bubbleSort();
}
	@Test 
	public void fullarraytest1() {
		
		int []arr = {1,2,3,4,5,6};
		Full_Array_under_test.setsize(arr,6);
		Full_Array_under_test.bubbleSort();

}
	@Test 
	public void fullarraytest2() {
		//Full_Array_under_test.set(6);
		int []arr = {1,2,3,4,5,6};
		Full_Array_under_test.setsize(arr,6);
		Full_Array_under_test.delete(0);
		Full_Array_under_test.display();
	}
	@Test 
	public void fullarraytest3() {
		//Full_Array_under_test.set(6);
		int []arr = {1,2,3,4,5,6};
		Full_Array_under_test.setsize(arr,6);
		Full_Array_under_test.delete(7);
		Full_Array_under_test.display();
	}
	@Test
	public void binarytest()
	{
		int [] array = {1,2,3,4,5};
		Full_Array_under_test.set11(array, 5);
		Assert.assertEquals(true,Full_Array_under_test.binarySearch(3, 0, 5));
		Assert.assertEquals(false,Full_Array_under_test.binarySearch(4, 5, 0));
		Assert.assertEquals(true,Full_Array_under_test.binarySearch(1, 0, 5));
		Assert.assertEquals(true,Full_Array_under_test.binarySearch(5, 0, 5));
	}
	@Test
	public void insertion()
	{
		int [] array = {1,2,3};
		
		
		int [] expected= {100,1,2,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//Full_Array_under_test.set(, 0);
		Full_Array_under_test.set(array, 3);
		Full_Array_under_test.insert(100, 0);
		int [] ar=Full_Array_under_test.get();
		for(int j=0;j<100;j++)
		{
		System.out.print(ar[j]+ "");	
		}
		//Assert.assertArrayEquals(expected, ar);
	}

}
