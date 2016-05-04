package tests;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.GameWin;

public class GameWinTest {
	private Point point;
	private String message;
	private GameWin my_gameWin;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		point = new Point(2, 1);
		message = "Winner";
		my_gameWin = new GameWin("Winner", point);
	}

	@After
	public void tearDown() throws Exception {
		point = null;
		message = "";
		my_gameWin = null;
	}

	@Test
	public void setupGUItest() {
		point = new Point(2, 1);
		message = "Winner";
		my_gameWin = new GameWin("Winner", point);
		assertFalse(my_gameWin.equals(null));
	}

}
