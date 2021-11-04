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
 * 1. ��� ���� �Ұ�ȣ("(")�� ������ �Ұ�ȣ(")")�͸� ¦�� �̷�� �Ѵ�.
 * 2. ��� ���� ���ȣ("[")�� ������ ���ȣ("]")�͸� ¦�� �̷�� �Ѵ�.
 * 3. ¦�� �̷�� �� ��ȣ�� ���� ��, �� ���̿� �ִ� ���ڿ��� ������ ������ �Ѵ�.
 * 4. �� ���ڿ��� ���� ���ĺ�, ����, �Ұ�ȣ("( )") ���ȣ("[ ]")������ �̷���� ������, ���̴� 100���ں��� �۰ų� ����.
 * 5. �Է��� ������������ �� �������� �� �ϳ�(".")�� ���´�.
 * 6. �� �ٸ��� �ش� ���ڿ��� ������ �̷�� ������ "yes"��, �ƴϸ� "no"�� ��� 
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
