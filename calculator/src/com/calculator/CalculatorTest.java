package com.calculator;

public class CalculatorTest {
//	Performing Methods
	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		calculate.setOperandOne(10.5);
		calculate.setOperation("+");
		calculate.setOperandTwo(5.2);
		calculate.performOperation();
		String results = calculate.getResults();
		System.out.println(results);
	}

}
