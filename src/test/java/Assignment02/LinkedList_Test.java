package Assignment02;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedList_Test {
	private LinkedList LinkedList_under_test;
	@Before
	public void setUp() throws Exception {
		 LinkedList_under_test = new  LinkedList();
	}

	
		@Test
		public void test1() {
			LinkedList_under_test.pushFront(1);
			LinkedList_under_test.pushFront(10);
			LinkedList_under_test.pushBack(100);
			LinkedList_under_test.display();
			
		}
		@Test
		public void test() {
			LinkedList_under_test.display();
			LinkedList_under_test.pushBack(100);
		}
		@Test
		public void test2() {
			LinkedList_under_test.pushFront(1);
			LinkedList_under_test.popFront();
			try {
				LinkedList_under_test.popFront();
			}
			catch(Exception e){
				System.out.println("Empty");
			}
		}
		@Test
		public void test3() {
			
			try {
				LinkedList_under_test.popBack();
			}
			catch(Exception e){
				System.out.println("Empty");
			}
			LinkedList_under_test.pushFront(1);
			LinkedList_under_test.pushFront(2);
			LinkedList_under_test.pushFront(3);
			try {
				LinkedList_under_test.popBack();
			}
			catch(Exception e){
				System.out.println("Successful");
			}
			
			
			}
		@Test
		public void test4() {
			LinkedList_under_test.pop(1);
		}
		@Test
		public void test5() {
			LinkedList_under_test.pushFront(1);
			LinkedList_under_test.pop(1);
			LinkedList_under_test.pushFront(2);
			LinkedList_under_test.pushFront(3);
			LinkedList_under_test.pushFront(5);
			LinkedList_under_test.pop(2);
			LinkedList_under_test.pop(3);
			LinkedList_under_test.display();
		}
	}


