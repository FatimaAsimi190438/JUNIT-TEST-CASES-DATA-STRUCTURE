package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MyStackTest {
	private MyStack MyStack_under_test;
	@Before
	public void setUp() throws Exception {
		MyStack_under_test = new MyStack(10);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void test() throws Exception {
		MyStack_under_test.push(5);
		int expectedresult = 5;
		int result = MyStack_under_test.top();
		Assert.assertEquals(expectedresult, result);
		MyStack_under_test.displayStack();
	}
	@Test
	public void test1() throws Exception {
		MyStack_under_test.push(1);
		MyStack_under_test.push(2);
		MyStack_under_test.push(3);
		MyStack_under_test.push(4);
		MyStack_under_test.push(5);
		MyStack_under_test.push(6);
		MyStack_under_test.push(7);
		MyStack_under_test.push(8);
		MyStack_under_test.push(9);
		MyStack_under_test.push(10);
		MyStack_under_test.size();
	}
	@Test 
	public void test2() throws Exception{
			MyStack_under_test.push(1);
			MyStack_under_test.push(2);
			MyStack_under_test.push(3);
			MyStack_under_test.push(4);
			MyStack_under_test.push(5);
			MyStack_under_test.push(6);
			MyStack_under_test.push(7);
			MyStack_under_test.push(8);
			MyStack_under_test.push(9);
			MyStack_under_test.push(10);
		try {
			MyStack_under_test.push(0);
			}
		catch (Exception exc) {
			System.out.println("Stack is full already");
			exc.printStackTrace();
		}
		int expectedresult1= 10;
		int result= MyStack_under_test.top();
		Assert.assertEquals(expectedresult1, result);
		}
	@Test 
	public void test3() throws Exception{
			MyStack_under_test.push(1);
			MyStack_under_test.push(2);
			MyStack_under_test.push(3);
			MyStack_under_test.push(4);
			MyStack_under_test.push(5);
			MyStack_under_test.push(6);
			MyStack_under_test.push(7);
			MyStack_under_test.push(8);
			MyStack_under_test.push(9);
			MyStack_under_test.push(10);
			MyStack_under_test.pop();
			int expectedresult1= 9;
			int result= MyStack_under_test.pop();
			Assert.assertEquals(expectedresult1, result);
			
			}
				
	}	



