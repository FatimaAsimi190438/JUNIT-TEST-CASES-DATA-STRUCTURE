package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Circular_LL_Test {
	private Circular_LinkedList Circular_LL_under_test;
	@Before
	public void setUp() throws Exception {
		Circular_LL_under_test = new  Circular_LinkedList();
	}

	
	@Test
	public void test() {
		Circular_LL_under_test.pushFront(1);
		Circular_LL_under_test.pushFront(10);
		Circular_LL_under_test.pushBack(100);
		Circular_LL_under_test.display();
		
	}
	@Test
	public void test1() {
		Circular_LL_under_test.display();
		Circular_LL_under_test.pushBack(100);
	}
	@Test
	public void test2() {
		Circular_LL_under_test.pushFront(1);
		Circular_LL_under_test.popFront();
		try {
			Circular_LL_under_test.popFront();
		}
		catch(Exception e){
			System.out.println("Empty");
		}
	}
	@Test
	public void test3() {
		
		try {
			Circular_LL_under_test.popBack();
		}
		catch(Exception e){
			System.out.println("Empty");
		}
		Circular_LL_under_test.pushFront(1);
		Circular_LL_under_test.pushFront(2);
		Circular_LL_under_test.pushFront(3);
		try {
			Circular_LL_under_test.popBack();
		}
		catch(Exception e){
			System.out.println("Successful");
		}
		
		
		}
	}

