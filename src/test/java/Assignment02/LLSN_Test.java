package Assignment02;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LLSN_Test {
	private LinkedList_SwapNodes LLSN_under_test;
	@Before
	public void setUp() throws Exception {
		LLSN_under_test = new LinkedList_SwapNodes();
	}
	@After
	public void tearDown() throws Exception {
		LLSN_under_test.display();
		System.out.println("The test case has been run sucessfully");
	}
	@Test
	public void test() {
			LLSN_under_test.pushFront(1);
			LLSN_under_test.pushFront(10);
			LLSN_under_test.pushBack(100);
			LLSN_under_test.display();
			
		}
	@Test
	public void tes1t() {
		LLSN_under_test.display();
		LLSN_under_test.swap();
		LLSN_under_test.pushBack(100);
	}
	@Test
	public void test2() {
			LLSN_under_test.pushFront(1);
			LLSN_under_test.pushFront(10);
			LLSN_under_test.swap();
}
}

