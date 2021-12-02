package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1357.java
 * @author			: Lee ChanBok
 * @date			: 2021.12.02
 * @description		:
 * 1. Rev(X)�� X�� ��� �ڸ����� �������� ����� �Լ�
 * 2. �� ���� ���� X�� Y�� �־����� ��, Rev(Rev(X) + Rev(Y))�� ���ϴ� ���α׷��� �ۼ�
 * 3. X�� Y�� 1,000���� �۰ų� ���� �ڿ��� 
 */
public class BAEK_1357 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = br.readLine().split(" ");
		
		String reverseResult = reverse(numbers);
		System.out.println(Integer.parseInt(reverseResult));
	}
	
	public static String reverse(String[] numbers) {
		StringBuffer result = new StringBuffer();
		
		int temp = 0;
		for(int i=0; i<numbers.length; i++) {
			String reverseStr = "";
			for(int j=numbers[i].length()-1; j>=0; j--) {
				reverseStr += numbers[i].charAt(j);
			}
			
			temp += Integer.parseInt(reverseStr);
		}
		
		return result.append(temp).reverse().toString();
	}
}
