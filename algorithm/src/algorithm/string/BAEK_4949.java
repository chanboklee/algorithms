package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_4949.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.04
 * @description		:
 * 1. 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
 * 2. 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
 * 3. 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
 * 4. 각 문자열은 영문 알파벳, 공백, 소괄호("( )") 대괄호("[ ]")등으로 이루어져 있으며, 길이는 100글자보다 작거나 같다.
 * 5. 입력의 종료조건으로 맨 마지막에 점 하나(".")가 들어온다.
 * 6. 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력 
 */
public class BAEK_4949 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer result = new StringBuffer();
		while(true) {
			String str = br.readLine();
			if(str.equals(".")) {
				break;
			}
			
			String balanceBracket = balanceBrackets(str);
			result.append(balanceBracket).append("\n");
		}
		
		System.out.println(result.toString());
	}
	
	public static String balanceBrackets(String str) {
		
		Stack<Character> brackets = new Stack<>(); 
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == ')' || ch == '[' || ch == ']') {
				if(brackets.isEmpty()) {
					brackets.push(ch);
				}else {
					if(ch == '(' || ch == '[') {
						brackets.push(ch);
					}else {
						if(ch == ')' && brackets.peek() == '(') {
							brackets.pop();
						}else if(ch == ']' && brackets.peek() == '['){
							brackets.pop();
						}else {
							brackets.push(ch);
						}
					}
				}					
			}
		}
		
		return brackets.isEmpty() ? "yes" : "no";
		
	}
}
