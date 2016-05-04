package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CheckerFrameTest.class, CheckerMoveTest.class, CheckersTest.class, GameEngineTest.class,
		GameWinTest.class, HelpTest.class, IntelliCheckerTest.class, PlaySoundTest.class, StartPanelTest.class })
public class AllTests {

}

