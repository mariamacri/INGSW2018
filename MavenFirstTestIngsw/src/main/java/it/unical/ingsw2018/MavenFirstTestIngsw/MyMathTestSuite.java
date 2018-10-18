package it.unical.ingsw2018.MavenFirstTestIngsw;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MyMathTest.class, MyMathPerformanceTest.class})
public class MyMathTestSuite {
	

}
