package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class RpnCal {

	public double calculate(String expression) throws Exception {
		// TODO Auto-generated method stub

		if (expression.length() < 0) {
			throw new Exception("String expr is empty");
		}
		String[] expressionArray = expression.split(",");
		Stack<Double> rpnStack = new Stack<Double>();
		List<String> operator = new ArrayList<String>();
		operator.add("+");
		operator.add("-");
		operator.add("*");
		operator.add("/");
		operator.add("^");

		double result;
		// looping expression array to push in stack and calculate
		for (String token : expressionArray) {
			if (operator.contains(token))
				binaryOperation(rpnStack, token);
			else if (token.equals("%"))
				unaryOperation(rpnStack, token);
			else
				rpnStack.push(Double.parseDouble(token));
		}

		result = rpnStack.pop();

		return result;
	}

	private void unaryOperation(Stack<Double> rpnStack, String token) {
		// TODO Auto-generated method stub
		double one = rpnStack.pop();
		double result = one / 100;
		rpnStack.push(result);
	}

	private void binaryOperation(Stack<Double> rpnStack, String token) {
		// TODO Auto-generated method stub
		double two = rpnStack.pop();
		double one = rpnStack.pop();
		double result = 0.0;

		if (token.equals("+"))
			result = one + two;
		else if (token.equals("-"))
			result = one - two;
		else if (token.equals("*"))
			result = one * two;
		else if (token.equals("/"))
			result = one / two;

		rpnStack.push(result);

	}
}
