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
 * 1. Rev(X)를 X의 모든 자리수를 역순으로 만드는 함수
 * 2. 두 양의 정수 X와 Y가 주어졌을 때, Rev(Rev(X) + Rev(Y))를 구하는 프로그램을 작성
 * 3. X와 Y는 1,000보다 작거나 같은 자연수 
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
