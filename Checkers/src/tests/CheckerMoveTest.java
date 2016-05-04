package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.CheckerMove;

import checkers.Checkers;

public class CheckerMoveTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		CheckerMove ch = new CheckerMove();
		Checkers check = new Checkers();
		int[][] board = new int[8][8];
		board[1][7] = 2;
	}

	@After
	public void tearDown() throws Exception {
		CheckerMove ch = null;
		Checkers check = null;
		int[][] board = null;
	}
	
	@Test
	public void getIndexTest() {
		// Tests getIndex();
		CheckerMove ch = new CheckerMove();
		int[] index = new int[2];
		index = ch.getIndex(25, 390);
		assertTrue(index[0] == 0);
		assertTrue(index[1] == 7);
		index = ch.getIndex(390, 15);
		assertTrue(index[0] == 7);
		assertTrue(index[1] == 0);
	}
	
	@Test
	public void noMovesLeftTest()
	{
		// Tests noMovesLeft();
		CheckerMove ch = new CheckerMove();
		int[][] board = new int[8][8];
		board[1][7] = 2;
		assertTrue(ch.noMovesLeft(board, 2));
	}

}
