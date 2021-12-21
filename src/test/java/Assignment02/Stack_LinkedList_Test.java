package Assignment02;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
public class Stack_LinkedList_Test {
	private Stack_LinkedList Stack_LinkedList_under_Test;
	@Before
	public void setUp() throws Exception {
		Stack_LinkedList_under_Test = new Stack_LinkedList();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		int expectedresult = -1;
		int result = Stack_LinkedList_under_Test.pop();
		Assert.assertEquals(expectedresult, result);
	}
	@Test
	public void test1() {
		int expectedresult = -1;
		int result = Stack_LinkedList_under_Test.top();
		Assert.assertEquals(expectedresult, result);
	}
	@Test
	public void test2() {
		Stack_LinkedList_under_Test.push(50);
		Stack_LinkedList_under_Test.push(500);
		Stack_LinkedList_under_Test.push(5000);
		Stack_LinkedList_under_Test.display();
		Stack_LinkedList_under_Test.getSize();
		Assert.assertEquals(5000,Stack_LinkedList_under_Test.pop());
		Assert.assertEquals(500,Stack_LinkedList_under_Test.pop());
		Assert.assertEquals(50,Stack_LinkedList_under_Test.top());
		
	}
	@Test
	public void test3() {
		Stack_LinkedList_under_Test.display();
	}

}
