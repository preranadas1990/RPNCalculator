package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Pattern;

public class RpnCal {

	public int calculate(String expr) throws Exception {
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
		int result;
		for(String exp : exparr){
			if(op.contains(exp)){
				int two = Integer.parseInt(st.pop());
				int one = Integer.parseInt(st.pop());
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
				
			}else{
				st.push(exp);
			}
			
		}
		result = Integer.parseInt(st.pop());
		
		return result;
	}

}
