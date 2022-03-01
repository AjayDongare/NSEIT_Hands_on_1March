package junitexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

public class TestCase2 
{
	@Test
	@Ignore
	public void test4()
	{
		System.out.println("Inside the test4");
	}
	
	@Test(expected= ArithmeticException.class )
	public void test5() 
	{
		System.out.println("Inside the test5");
		int a=10/2;
		String str = null;
		str.equals("hello");
	}
	@Test
	public void test6()
	{
		System.out.println("Inside the test6");
	}

}

