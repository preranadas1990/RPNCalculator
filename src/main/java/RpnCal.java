package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class RpnCal {

	public double calculate(String expr) throws Exception {
		// TODO Auto-generated method stub
		
		if(expr.length()<0){
			throw new Exception("String expr is empty");
		}
		String[] exparr = expr.split(",");
		Stack<String> st = new Stack<String>();
		List op = new ArrayList();
		op.add("+");
		op.add("-");
		op.add("*");
		op.add("/");
		op.add("^");

		
		double result;
		for(String exp : exparr){
			if(op.contains(exp)){
				double two = Double.parseDouble(st.pop());
				double one = Double.parseDouble(st.pop());
				switch(exp){
				case "+":result = one + two;
				st.push(String.valueOf(result));
				break;
				case "-":result = one - two;
				st.push(String.valueOf(result));
				break;
				case "*":result = one * two;
				st.push(String.valueOf(result));
				break;
				case "/":result = one / two;
				st.push(String.valueOf(result));
				break;	
				
				}				
				
			}else if(exp.equals("%")){
				double one = Double.parseDouble(st.pop());
				 result = one/100;
				 System.out.println(one +"res"+result);
				 st.push(String.valueOf(result));
			}
			
			
			else{
				st.push(exp);
			}
			
		}
		result = Double.parseDouble(st.pop());
		
		return result;
	}

}
