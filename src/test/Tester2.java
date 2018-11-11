package test;

import java.util.Stack;

/**
 * Copyright (C) 2012 Lear C
 */
 
/**
 * 1 2 3 4 5 6 7 8 9 = 100 
 * <p/> 
 * �����ּ�����ӺŻ��߼��ţ����Բ�������������������ţ�ʹ��ʽ������ <br/>
 * һ�ָ��õķ����ǣ�<br/>
 * ÿһ����϶֮�䶼�����ֿ��ܣ�"+", "-", ""������һ����3^8�ֿ��ܡ�
 * 
 * @author Lear
 */
public class Tester2 {
	
	private static final char[] NUMBERS = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};  
	private static final String[] OPERATORS = {"+", "-", ""};
    private static final int RESULT = 100;  // ������  
 
	public static void main(String[] args) {
		sortAndCompute(0, "");
	}
 
	private static void sortAndCompute(int numIndex, String buffer) {
		// ˵�������һ���ַ���
		if(numIndex == NUMBERS.length - 1) {
			buffer += NUMBERS[numIndex];
			String formula = buffer.toString();
			if(sum(formula) == RESULT) {
				System.out.println(formula + " = " + RESULT);
			}
			return;
		}
		
		for(int operIndex = 0; operIndex < OPERATORS.length; ++operIndex) {
			buffer += NUMBERS[numIndex];
			buffer += OPERATORS[operIndex];
			sortAndCompute(numIndex + 1, buffer);
			// ����ǰ�������Ѿ���ӵ��ַ��ָ�ԭ״���Ա���һ��ѭ���ĵ���
			// ���ǵ��м����ӷ���Ϊ''��ʱ����ֻɾ��buffer�е�ǰ��һ���ַ�
			buffer = operIndex != 2 ? buffer.substring(0, buffer.length() - 2)
					: buffer.substring(0, buffer.length() - 1);
		}
	}
	
	private static int sum(String formula) {
		if(formula == null || formula.trim().length() == 0)
			throw new IllegalArgumentException("formula is invalid!");
		
		Stack<String> numStack = new Stack<String>();
		Stack<String> operStack = new Stack<String>();
		StringBuffer numBuffer = new StringBuffer();
		
		formula += "#";	// ���һ������������ʽĩβ���ڼ���
		char[] chs = formula.toCharArray();
		for(int index = 0; index < formula.length(); ++index) {
			if(chs[index] != '+' && chs[index] != '-' && chs[index] != '#') {
				numBuffer.append(chs[index]);
			} else {
				numStack.push(numBuffer.toString());
				numBuffer.delete(0, numBuffer.length());
				
				if(operStack.isEmpty()) operStack.push(chs[index] + "");
				else {
					int numAft = Integer.parseInt(numStack.pop());
					int numBef = Integer.parseInt(numStack.pop());
					String oper = operStack.pop();
					int sum = oper.equals("+") ? numBef + numAft : numBef - numAft;
					numStack.push(sum + "");
					operStack.push(chs[index] + "");
				}
			}
		}
		return Integer.parseInt(numStack.pop());
	}
}