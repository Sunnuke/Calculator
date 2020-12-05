package com.calculator;

import java.util.ArrayList;

public class Calculator {
	
//	Attributes
	private ArrayList<Double> save;
	private String Operation;
	private double OperandOne;
	private double OperandTwo;
	
//	Methods
	public void setOperation(String op) {
		Operation = op;
	}
	public void setOperandOne(double num) {
		OperandOne = num;
	}
	public void setOperandTwo(double num) {
		OperandTwo = num;
	}
	public void performOperation() {
		if (this.Operation == "+") {
			double x = this.OperandOne + this.OperandTwo;
			save.add(x);
		}
		else if (this.Operation == "-") {
			double x = this.OperandOne - this.OperandTwo;
			save.add(x);
		}
		else {
			System.out.println("The Operation must be '+' or '-'!");
		}
	}
	public String getResults() {
		return "Most Recent Problem: " + this.OperandOne + " " + Operation + " " + this.OperandTwo + " = " + save.get(save.size() - 1);
	}
}
