package it.unical.ingsw2018.MavenFirstTestIngsw;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

//test case singoli metodi void senza parametri
public class MyMathTest {
	MyMath math=new MyMath(); 
	//ogni test case ha un'istanza separata, quindi math sarà fatta in 3 metodi tre volte
	//viene chiamato ogni volta prima di un test quindi qui 3 volte 
	@Before
	public void prepare()
	{
		System.out.println(math);
		System.out.println("before");
	}
	
	
	@Test
	public void simpleFibonacciTest()
	{	
		System.out.println("simpleFibtest");
		//primo parametro di assertEquals è un expeted "5" e l'attuale è quello chiamato sull'indice 4
		assertEquals(5,math.fibonacci(4));
		
	}
	@Test
	public void exitConditionsFibonacciTest()
	{	
		System.out.println("exitConditionFibtest");
		//primo parametro di assertEquals è un expeted "5" e l'attuale è quello chiamato sull'indice 4
		assertEquals(1,math.fibonacci(0));
		assertEquals(1,math.fibonacci(1));
	}
	
	
	//aggiungo un test in cui mi "aspetto" un argomento illegale
	@Test (expected=IllegalArgumentException.class)
	public void illegalArgumentTest()
	{	
		System.out.println("illegalArgumentFibtest");
		math.fibonacci(-1);
	}
	//i metodi after e before sono statici esistono una volta nella clsse 
	@AfterClass
	public static void cleanup()
	{
		System.out.println("AfterClass");
	}
	@Test
	public void distanceSimpleTest()
	{
		double dist=math.distance(10, 10, -10, -10);
		assertEquals(Math.sqrt(800),dist,0.001);
	}
	
	@Test
	public void errorTest()
	{
		assertEquals(0.1+0.1+0.1,0.3);
	}
}
