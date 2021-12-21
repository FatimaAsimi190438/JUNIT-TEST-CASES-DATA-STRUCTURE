package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeQueue_Test {
	private DeQueue DeQueue_under_test;
	@Before
	public void setUp() throws Exception {
		DeQueue_under_test = new DeQueue(9);
	}

	@After
	public void tearDown() throws Exception {
		DeQueue_under_test.display();
		System.out.println("The test case has been run sucessfully");
	}

	@Test
	public void test() {
		DeQueue_under_test.addRight(1);
		DeQueue_under_test.addRight(2);
		DeQueue_under_test.addRight(3);
		DeQueue_under_test.addRight(4);
		//DeQueue_under_test.addRight(5);
		int [] expectedresult= {0,0,0,0,0,4,3,2,1};
		//int [] result = DeQueue_under_test.get();
		Assert.assertArrayEquals(expectedresult,DeQueue_under_test.get());
	}
	@Test
	public void test1() {
		DeQueue_under_test.addLeft(1);
		DeQueue_under_test.addLeft(2);
		DeQueue_under_test.addLeft(3);
		DeQueue_under_test.addLeft(4);
		DeQueue_under_test.addLeft(5);
		int [] expectedresult= {1,2,3,4,5,0,0,0,0};
		//int [] result = DeQueue_under_test.get();
		Assert.assertArrayEquals(expectedresult, DeQueue_under_test.get());
	}
	@Test
	public void test2() {
		DeQueue_under_test.addRight(10);
		DeQueue_under_test.addRight(20);
		DeQueue_under_test.addRight(30);
		DeQueue_under_test.addRight(40);
		DeQueue_under_test.addRight(50);

		DeQueue_under_test.addLeft(1);
		DeQueue_under_test.addLeft(2);
		DeQueue_under_test.addLeft(3);
		DeQueue_under_test.addLeft(4);
		//DeQueue_under_test.addLeft(5);
		int [] expectedresult= {1,2,3,4,50,40,30,20,10};
		//int [] result = DeQueue_under_test.get();
		Assert.assertArrayEquals(expectedresult, DeQueue_under_test.get());
	}
	@Test
	public void test3() {
		DeQueue_under_test.setlp(0);
		DeQueue_under_test.setrp(8);
		DeQueue_under_test.addRight(1);
		int [] expectedresult = {0,0,0,0,0,0,0,0,0};
		Assert.assertArrayEquals(expectedresult, DeQueue_under_test.get());
	}
	@Test
	public void test4() {
		DeQueue_under_test.setlp(5);
		DeQueue_under_test.setrp(0);
		DeQueue_under_test.addRight(1);
		DeQueue_under_test.addRight(10);
		DeQueue_under_test.addRight(100);
		DeQueue_under_test.addRight(1000);
		DeQueue_under_test.addRight(100000);
		int [] expectedresult = {0,1000,100,10,1,0,0,0,0};
		System.out.println("array is " +DeQueue_under_test.get());
		Assert.assertArrayEquals(expectedresult, DeQueue_under_test.get());
	}
	
	
}
