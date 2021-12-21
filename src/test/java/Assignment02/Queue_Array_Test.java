package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


import Assignment02.Queue_Array;

public class Queue_Array_Test {

	private Queue_Array Queue_Array_under_test;
	
	
	@Before
	public void setUp() throws Exception {
		Queue_Array_under_test= new Queue_Array(10);
		
	}
	@Test
	public void test1() throws Exception {
		Queue_Array_under_test.enqueue(1);
		Queue_Array_under_test.enqueue(10);
		Queue_Array_under_test.enqueue(100);
		Queue_Array_under_test.enqueue(1000);
		Queue_Array_under_test.enqueue(10000);
		Queue_Array_under_test.grp();
		int []expectedresult ={1,10,100,1000,10000};
		int [] result = Queue_Array_under_test.get();
		for (int i=0; i<Queue_Array_under_test.getsize(); i++){
			Assert.assertEquals(expectedresult[i], result[i]);
		}	
		
	}
	@Test
	public void test2() throws Exception {
		Queue_Array_under_test.enqueue(1);
		Queue_Array_under_test.enqueue(10);
		Queue_Array_under_test.enqueue(100);
		Queue_Array_under_test.enqueue(1000);
		Queue_Array_under_test.enqueue(10000);
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.gal();
		int []expectedresult1 ={1};
		int [] result1 = Queue_Array_under_test.get();
		for (int i=0; i<=Queue_Array_under_test.getsize(); i++){
			Assert.assertEquals(expectedresult1[i], result1[i]);
		}	
		
	}
	@Test
	public void test3() throws Exception {
		Queue_Array_under_test.display();
		Queue_Array_under_test.enqueue(1);
		Queue_Array_under_test.enqueue(2);
		Queue_Array_under_test.enqueue(3);
		Queue_Array_under_test.enqueue(4);
		Queue_Array_under_test.enqueue(5);
		Queue_Array_under_test.enqueue(6);
		Queue_Array_under_test.enqueue(7);
		Queue_Array_under_test.enqueue(8);
		Queue_Array_under_test.enqueue(9);
		Queue_Array_under_test.enqueue(10);
		Queue_Array_under_test.display();
		Queue_Array_under_test.enqueue(11);
			
	}
	@Test
	public void test4() throws Exception {
		Queue_Array_under_test.dequeue();
		}
	@Test
	public void test5() throws Exception {
		
		Queue_Array_under_test.enqueue(10);
		Queue_Array_under_test.enqueue(20);
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.enqueue(30);
		Queue_Array_under_test.dequeue();
		Queue_Array_under_test.enqueue(10);
		Queue_Array_under_test.enqueue(10);
	}
	
}
		

