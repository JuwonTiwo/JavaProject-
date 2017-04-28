package sourceFiles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	public Main testClass;
	
	@Before
	public void setUp() throws Exception {
		Main testClass = new Main();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		testClass.main(null);
		assert(testClass.basket.getNumbers()==30);
	}

}
