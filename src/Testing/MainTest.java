package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

	private Main tester;

	@Before
	public void setUp() {
		tester = new Main();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMainNumbers() {
		tester.main(null);
		assertEquals(10, tester.numbers);
	}

}
