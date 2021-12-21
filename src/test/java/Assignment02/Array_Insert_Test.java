package Assignment02;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Array_Insert_Test {
	private Array_Insert Array_Insert_under_test;
	@Before
	public void setUp() throws Exception {
		Array_Insert_under_test = new Array_Insert();
	}

	@Test
	public void test() {
		int [] arr= {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
		int nti = 100;
		int iti = 11;
		int [] expectedresult = {0,1,2,3,4,5,6,7,8,9,10,100,12,13};
		int [] result= Array_Insert_under_test.insert(arr, nti, iti);
		Assert.assertArrayEquals(expectedresult , result);
		int nti1 = 102;
		int iti2 = 0;
		int [] expectedresult1 = {102,0,1,3,4,5,6,7,8,9,10,100,12,13};
		int []  result1 = Array_Insert_under_test.insert(arr, nti1, iti2);
		Assert.assertArrayEquals(expectedresult1 , result1);
		int [] arr1 = {1,2,3,4};
		int nti3=10;
		int iti4= 2;
		Array_Insert_under_test.setsize(6);
		int [] expectedresult2= {1,2,3,4};
		int [] result2= Array_Insert_under_test.insert(arr1, nti3, iti4);
		Assert.assertArrayEquals(expectedresult2, result2);
}
}
