package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Queue_Test {
	private Queue Queue_under_test;
	@Before
	public void setUp() throws Exception {
		Queue_under_test = new Queue(5);
	}

	@Test
	public void test1() throws Exception {
		Queue_under_test.display();
		 Queue_under_test.enqueue(4);
		 Queue_under_test.enqueue(40);
		 Queue_under_test.enqueue(400);
		 Queue_under_test.enqueue(4000);
		 Queue_under_test.enqueue(5);
		 Queue_under_test.display();
		 Queue_under_test.get_size();
		 Queue_under_test.size();
		 int[] expextedresult= {4,40,400,4000,5};
		 int [] result = Queue_under_test.get();
			for (int i=0; i<Queue_under_test.size(); i++)
			{
				Assert.assertEquals( expextedresult[i], result[i]);
			}
		 
	}
	@Test
	public void test2() throws Exception {
		Queue_under_test.enqueue(4);
		 Queue_under_test.enqueue(40);
		 Queue_under_test.enqueue(400);
		 Queue_under_test.enqueue(4000);
		 Queue_under_test.enqueue(40000);
		 Assert.assertFalse(Queue_under_test.empty());
		 Queue_under_test.get_rp();
		 Queue_under_test.dequeue();
		 Queue_under_test.dequeue();
		 Queue_under_test.dequeue();
		 Queue_under_test.dequeue();
		 Queue_under_test.dequeue();
		 
		 int[] expextedresult= {4};
		 int [] result = Queue_under_test.get();
			for (int i=0; i<=Queue_under_test.size(); i++)
			{
				Assert.assertEquals( expextedresult[i], result[i]);
				
			}
	}
			@Test
			public void test4()  {
				try {
					Queue_under_test.dequeue();
				} catch (Exception e) {
					System.out.println("Queue is empty");
				}
			}
			@Test
			public void test5()  {
				Assert.assertTrue(Queue_under_test.empty());
			}
			@Test
			public void test6() throws Exception {
				Queue_under_test.display();
				 Queue_under_test.enqueue(10);
				 Queue_under_test.enqueue(20);
				 Queue_under_test.enqueue(30);
				 Queue_under_test.enqueue(40);
				 Queue_under_test.enqueue(50);
				 
				 try {
						Queue_under_test.enqueue(101);
					} catch (Exception e) {
						System.out.println("Queue is full");
					}
			}	
			@Test
			public void test7() throws Exception {
				Queue_under_test.display();
				 Queue_under_test.enqueue(10);
				 Queue_under_test.enqueue(20);
				 Queue_under_test.enqueue(30);
				 Queue_under_test.enqueue(40);
				 Queue_under_test.enqueue(50);
				 
				 try {
						Queue_under_test.enqueue(101);
					} catch (Exception e) {
						System.out.println("Queue is full");
					}
				 Queue_under_test.dequeue();
				 Queue_under_test.enqueue(101);
				 try {
						Queue_under_test.enqueue(101);
					} catch (Exception e) {
						System.out.println("Queue is full");
					}
			}	
		
}
