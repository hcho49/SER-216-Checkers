package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.IntelliChecker;

public class IntelliCheckerTest {
	private IntelliChecker my_intelliChecker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		my_intelliChecker = new IntelliChecker();
	}

	@After
	public void tearDown() throws Exception {
		my_intelliChecker = null;
	}

	@Test
	public void testIntelliChecker() {
		assertFalse(my_intelliChecker.equals(null));
	}

}
