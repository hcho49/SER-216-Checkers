package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import checkers.PlaySound;

public class PlaySoundTest {
	private PlaySound my_playSound;
	private String fileName = "button.wav";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		my_playSound = new PlaySound(fileName);
	}

	@After
	public void tearDown() throws Exception {
		my_playSound = null;
	}

	@Test
	public void soundTest() {
		String file1 = "button.wav";
		String file2 = "clickChecker.wav";
		String file3 = "comPlay.wav";
		String file4 = "option.wav";
		String file5 = "Start.wav";
		String file6 = "Win.wav";
		PlaySound my_playSound1 = new PlaySound(file1);
		PlaySound my_playSound2 = new PlaySound(file2);
		PlaySound my_playSound3 = new PlaySound(file3);
		PlaySound my_playSound4 = new PlaySound(file4);
		PlaySound my_playSound5 = new PlaySound(file5);
		PlaySound my_playSound6 = new PlaySound(file6);
		assertFalse(my_playSound.equals(null));
		assertFalse(my_playSound1.equals(null));
		assertFalse(my_playSound2.equals(null));
		assertFalse(my_playSound3.equals(null));
		assertFalse(my_playSound4.equals(null));
		assertFalse(my_playSound5.equals(null));
		assertFalse(my_playSound6.equals(null));
		
	}

}
