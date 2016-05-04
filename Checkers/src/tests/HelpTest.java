package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.Help;

public class HelpTest {
	private Help checkerHelp;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		checkerHelp = new Help();
	}

	@After
	public void tearDown() throws Exception {
		checkerHelp = null;
	}

	@Test
	public void setupGUITest() {
		assertFalse(checkerHelp.equals(null));
	}

}
