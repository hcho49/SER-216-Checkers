package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.CheckerMove;
import checkers.Checkers;

public class CheckersTest {

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
	public void noMovesLeftTest() {
		// Tests noMovesLeft();
		CheckerMove ch = new CheckerMove();
		int[][] board = new int[8][8];
		board[1][7] = 2;
		assertTrue(ch.noMovesLeft(board, 2));
	}

	@Test
	public void isMoveLegalTest() {
		// Tests isMoveLegal();
		CheckerMove ch = new CheckerMove();
		int[][] board = new int[8][8];
		board[1][7] = 2;
		board[2][5] = 2;
		board[3][4] = 1;
		board[4][3] = 0;
		board[1][4] = 0;
		board[3][2] = 2;
		board[5][2] = 2;
		assertTrue(ch.isMoveLegal(board, 2, 5, 1, 4, 2) == 2);
		assertTrue(ch.isMoveLegal(board, 2, 5, 4, 3, 2) == 3);
	}

}
