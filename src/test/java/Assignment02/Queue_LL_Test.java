package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class Queue_LL_Test {
		private  Queue_LinkedList Queue_LL_under_test;
	@Before
	public void setUp() throws Exception {
		Queue_LL_under_test = new Queue_LinkedList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("All test cases have executef successfully");
	}

	@Test
	public void test() {
		Queue_LL_under_test.enqueue(1);
		Queue_LL_under_test.enqueue(10);
		Queue_LL_under_test.enqueue(100);
		Queue_LL_under_test.enqueue(1000);
		Queue_LL_under_test.display();
	}
	//@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		Queue_LL_under_test.display();
		Queue_LL_under_test.dequeue();
		Queue_LL_under_test.enqueue(1);
		Queue_LL_under_test.enqueue(10);
		Queue_LL_under_test.enqueue(100);
		Queue_LL_under_test.enqueue(1000);
		Queue_LL_under_test.display();
		int expectedresult = 1;
		int result =Queue_LL_under_test.dequeue();
		Assert.assertEquals(expectedresult,result);
	}
	
	}

