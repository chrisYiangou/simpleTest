package com.qa.myfirstmavenproject.main.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.qa.myfirstmavenproject.main.calculator.Calculator;

public class CalculatorUnitTest {

	//Testing the functionality of our methods -- IN SELDOM 
	// Ideally each test should equate to a single Method in the class
	
	//As a minimum you shall be required to perform at least the unit testing.
	// Integration - Mockito -- HomeWork 
	
	// So if for any reason you're unit testing is taking too long 
	// Have I created an integration - why???
	
	// So We have some annotations to learn
	// 
	// SetUp - BeforeEach - Run this before each Test and BeforeClass - run this before all tests
	// TearDown - afterEach - Run this after each Test and AfterClass 
	
	
	
	// @Test -- Tests duh
	// retrun will always be void 
	// assertTrue -- check if something is true 
	// assertEquals 
	// assertNotEquals
	
	
	// For
	
	//Dependency Injection 
	
	Calculator testCalc;
	
	
	
	@BeforeEach
	public void setup() {
		 testCalc = new Calculator();
		System.out.println("Hello");
	}
	
	@Test
	public void testing() {
		// I need to make an instance of a calculator 
		// It needs to take in two numbers
		// 2 and 3 are inputed - that means 5 must be returned
		
		int numOne = 2;
		int numTwo = 3;
		
		int expected = numOne + numTwo;
		
		assertEquals(expected, testCalc.add(numOne, numTwo));
		
		
	}
	
	// When Databases are used - Uou could potentailly be putting data into somewhere it shouldnt
	// So ensure that your class break down any of the test data 
	
	
	//Sub 
	// 1: Takes in two numbers and sees if they are greater than 10
	// return numOne - numTwo
	// 2: If sum is smaller than 10 - return 0
	// methodName_StateUnderTest_ExpectedBehavious

	@Test 
	public void sub_SumGreater_Difference() {
		// I will take in two values -- the sum will be greater than
		// 10. 
		int numOne =7;
		int numTwo = 9;
		
		int expected = numOne - numTwo;
		
//		assertTrue(true, numOne + numTwo > 10);
		assertEquals(expected, testCalc.sub(numOne, numTwo));
	}
	
	@Test 
	public void sub_SumLesser_Zero() {
		// I will take in two values -- the sum will be greater than
		// 10. 
		int numOne =2;
		int numTwo = 3;
		
		int expected = 0;
		
//		assertTrue(true, numOne + numTwo > 10);
		assertEquals(expected, testCalc.sub(numOne, numTwo));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test 
//	public void testing2() {
//		System.out.println("Bonjour");
//	}
	@AfterEach
	public void teardown() {
		System.out.println("Bye");
	}
	

	
}
