package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.GameEngine;

public class GameEngineTest {
	//Test fixture 
    final static int inf = Integer.MAX_VALUE;
    final static int normal = 100;         //one checker worth 100
    final static int king=200;             //a King's worth
    final static int pos=1;                //one position along the -j worth 1
    final static int edge=10;               // effect of king being on the edge
    private GameEngine my_gameEngine; 
	
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		my_gameEngine = new GameEngine();
	}

	@After
	public void tearDown() throws Exception {
		my_gameEngine = null;
	}

	@Test
	public void evalTest() {
		int[][] board = new int[8][8];
		board[1][7] = 2;
		int wrongVal_1 = 12;
		int wrongVal_2 = 200;
		int wrongVal_3 = 54;
		int wrongVal_4 = 77;
		assertFalse(my_gameEngine.eval(board) == wrongVal_1);
		assertFalse(my_gameEngine.eval(board) == wrongVal_2);
		assertFalse(my_gameEngine.eval(board) == wrongVal_3);
		assertFalse(my_gameEngine.eval(board) == wrongVal_4);
	}
	
	@Test
	public void getTurnTest() {
		int turn = 2;
		assertFalse(my_gameEngine.getTurn(turn) == Integer.MAX_VALUE);
	}
}
