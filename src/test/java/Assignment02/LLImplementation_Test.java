package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LLImplementation_Test {
	private Linked_List_Implementation LL_Implementation_under_test;
	@Before
	public void setUp() throws Exception {
		 LL_Implementation_under_test =new	Linked_List_Implementation();
	}
	
	@After
	public void tearDown() throws Exception {
		LL_Implementation_under_test.display();
		System.out.println("The test case has been run sucessfully");
	}

	@Test
	public void test1() {
		LL_Implementation_under_test.pushFront(1);
		LL_Implementation_under_test.pushFront(10);
		LL_Implementation_under_test.pushBack(100);
		LL_Implementation_under_test.display();
		
	}
	@Test
	public void test() {
		LL_Implementation_under_test.display();
		LL_Implementation_under_test.pushBack(100);
	}
	@Test
	public void test2() throws Exception {
		LL_Implementation_under_test.pushFront(1);
		LL_Implementation_under_test.popFront();
		try {
			LL_Implementation_under_test.popFront();
		}
		catch(Exception e){
			System.out.println("Empty");
		}
	}
	@Test
	public void test3() {
		
		try {
			LL_Implementation_under_test.popFront();
		}
		catch(Exception e){
			System.out.println("Empty");
		}
		LL_Implementation_under_test.pushFront(1);
		LL_Implementation_under_test.pushFront(2);
		LL_Implementation_under_test.pushFront(3);
		try {
			LL_Implementation_under_test.popFront();
		}
		catch(Exception e){
			System.out.println("Successful");
		}
		
		
		}
	@Test
	public void test4() throws Exception {
		LL_Implementation_under_test.popFront();
		LL_Implementation_under_test.popFront();
		try {
			LL_Implementation_under_test.topBack();
		}
		catch (Exception e){
			System.out.println("Empty ");
		}
	}
	@Test
	public void test7() throws Exception {
		LL_Implementation_under_test.pushFront(1);
		
		LL_Implementation_under_test.topBack();
	}
	@Test
	public void test5() throws Exception {
		LL_Implementation_under_test.pushFront(1);
		LL_Implementation_under_test.popFront();
		LL_Implementation_under_test.pushFront(2);
		LL_Implementation_under_test.pushFront(3);
		LL_Implementation_under_test.pushFront(5);
		LL_Implementation_under_test.popFront();
		LL_Implementation_under_test.popFront();
		LL_Implementation_under_test.display();
	}
	@Test
	public void test8() throws Exception {
		LL_Implementation_under_test.pushFront(1);
		LL_Implementation_under_test.pushFront(2);
		LL_Implementation_under_test.pushFront(4);
		LL_Implementation_under_test.add(1);
		LL_Implementation_under_test.add(10);
		LL_Implementation_under_test.size();
		LL_Implementation_under_test.display();
	}
	@Test
	public void test9() throws Exception {
	try {
		LL_Implementation_under_test.popFront();
	}
	catch(Exception e) {
		System.out.println("Empty");
	}
	}
}