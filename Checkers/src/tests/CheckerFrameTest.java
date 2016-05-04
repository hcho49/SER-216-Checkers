package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.CheckerFrame;

public class CheckerFrameTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		CheckerFrame my_frame = new CheckerFrame();
	}

	@After
	public void tearDown() throws Exception {
		CheckerFrame my_frame = null;
	}

	@Test
	public void checkerFrameSetupGUITest() {
		CheckerFrame my_frame = new CheckerFrame();
		assertFalse(my_frame.equals(null));
	}

}
