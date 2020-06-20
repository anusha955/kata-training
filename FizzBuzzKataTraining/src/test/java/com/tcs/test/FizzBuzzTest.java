package com.tcs.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tcs.com.core.FizzBuzzHandler;

public class FizzBuzzTest {
	
	FizzBuzzHandler handler=new FizzBuzzHandler();
	@Test
	public void tesIfZero() {
		assertEquals("0",handler.checkFizzOrBuzz(0));
	}
	@Test
	public void tesNottFizzBuzz() {
		assertEquals("1",handler.checkFizzOrBuzz(1));
	}
	@Test
	public void testFizz() {
		assertEquals("Fizz",handler.checkFizzOrBuzz(3));
	}
	@Test
	public void testBuzz() {
		assertEquals("Buzz",handler.checkFizzOrBuzz(5));
	}
	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz",handler.checkFizzOrBuzz(15));
	}

}
