import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatchTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void before() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void isMatching() {
		System.out.println("Test");
		MatchHobby matcher = new MatchHobby();
		User testOne = new User("Joe", "Swimming");
		User testTwo = new User("Harold", "Swimming");
		User testThree = new User("Dana", "Wrestling");
		assertEquals("Here is the test for multiplication", true, matcher.match(testOne, testTwo)); //CORRECT test case
		//assertEquals("Here is the test for multiplication", true, matcher.match(testOne, testThree)); //INCORRECT test case
	}
	
	@After
	public void after() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
