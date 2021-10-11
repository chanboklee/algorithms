package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다.
// 2. x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다.
// 3. 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다.
// 4. “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열
// 5. 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력
public class BAEK_9012 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuffer resultVps = new StringBuffer();
		for(int i=0; i<N; i++) {
			String parenthesisString = br.readLine();
			String vps = checkVps(parenthesisString);
			resultVps.append(vps).append("\n");
		}
		
		System.out.println(resultVps.toString());
	}
	
	public static String checkVps(String parenthesisString) {
		Stack<Character> parenthesisStack = new Stack<>();
		
		for(int i=0; i<parenthesisString.length(); i++) {
			char parenthesis = parenthesisString.charAt(i);
			if(parenthesisStack.isEmpty()) {
				parenthesisStack.push(parenthesis);
			}else {
				if(parenthesis == '(') {
					parenthesisStack.push(parenthesis);
				}else {
					if(parenthesisStack.peek() == '(') {
						parenthesisStack.pop();
					}else {
						parenthesisStack.push(parenthesis);
					}
				}
			}
		}
		
		return parenthesisStack.isEmpty() ? "YES" : "NO"; 
		
	}
}
