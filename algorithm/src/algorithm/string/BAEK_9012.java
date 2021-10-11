package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 1. �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���.
// 2. x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�.
// 3. �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�.
// 4. ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ�
// 5. �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ���
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
