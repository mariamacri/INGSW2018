package it.unical.ingsw2018.MavenFirstTestIngsw;

import org.junit.Test;

public class MyMathPerformanceTest {
	
	private MyMath myMath=new MyMath();
	
	//entro 20 secondi non deve fallire
	//test sulle performance
	@Test(timeout=10000)
	public void performanceTest1()
	{
		System.out.println(myMath.fibonacci(30));
		//myMath.fibonacci(100);
	}
	
	
}
