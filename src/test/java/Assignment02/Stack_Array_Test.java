package Assignment02;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Stack_Array_Test {
	private Stack_Array Stack_Array_under_Test;
	@Before
	public void setUp() throws Exception {
		Stack_Array_under_Test = new Stack_Array();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Successfuly executed all the test cases.");
		Stack_Array_under_Test.display();
	}

	@Test
	public void test(){
		Stack_Array_under_Test.push(10);
		Stack_Array_under_Test.push(100);
		Stack_Array_under_Test.push(1000);
		Stack_Array_under_Test.push(10000);
		int [] expectedresult = {10,100,1000,10000};
		int [] result =Stack_Array_under_Test.get();
		for (int i = 0; i< Stack_Array_under_Test.get_size(); i++ ) {
			Assert.assertEquals(expectedresult[i], result[i]);
			
		}
	}
	@Test
	public void test1(){
		Stack_Array_under_Test.setaddpointer(100000);
		Stack_Array_under_Test.push(1200);
		int [] expectedresult = {0};
		int [] result =Stack_Array_under_Test.get();
		
		for (int i=0; i<=Stack_Array_under_Test.get_size(); i++)
		{
			System.out.print("here" + result[i] + " ");
		}
		for (int i = 0; i<= Stack_Array_under_Test.get_size(); i++ ) {
			Assert.assertEquals(expectedresult[i], result[i]);
		}
		
	}
	@Test
	public void test2(){
		Stack_Array_under_Test.push(10);
		Stack_Array_under_Test.push(100);
		Stack_Array_under_Test.push(1000);
		Stack_Array_under_Test.push(10000);
		Stack_Array_under_Test.display();
		Assert.assertEquals(10000,Stack_Array_under_Test.pop());
		Assert.assertEquals(1000,Stack_Array_under_Test.pop());
		Assert.assertEquals(100,Stack_Array_under_Test.pop());
		Assert.assertEquals(10,Stack_Array_under_Test.pop());
		Assert.assertEquals(-1,Stack_Array_under_Test.pop());
	}

}
