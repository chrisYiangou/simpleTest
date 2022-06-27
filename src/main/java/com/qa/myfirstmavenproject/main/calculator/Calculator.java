package com.qa.myfirstmavenproject.main.calculator;

public class Calculator {

	public int add(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public int sub(int numOne, int numTwo) {
		
		if (numOne + numTwo > 10) {
			return numOne - numTwo;
		} else {
			return 0;

		}
	}

	public int mul(int numOne, int numTwo) {
		return numOne + numTwo;
	}

	public double div(int numOne, int numTwo) {
		return numOne + numTwo;
	}

}
