package com.tcs.com.core;

public class FizzBuzzHandler {
	public String checkFizzOrBuzz(int i) {
		if(i==0)
			return "0";
		if(i %3 ==0 && i%5==0)
			return "FizzBuzz";
		if(i % 3==0)
			return "Fizz";
		if(i % 5 ==0)
			return "Buzz";
		
		return String.valueOf(i);
		
		
	}

}
