package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.StartPanel;

public class StartPanelTest {
	private StartPanel my_startPanel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		my_startPanel = new StartPanel();
	}

	@After
	public void tearDown() throws Exception {
		my_startPanel = null;
	}

	@Test
	public void startPanelTest() {
		assertFalse(my_startPanel.equals(null));
	}

}
