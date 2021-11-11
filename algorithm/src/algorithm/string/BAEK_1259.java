package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1259.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.11
 * @description		:
 * 1. 어떤 단어를 뒤에서부터 읽어도 똑같다면 그 단어를 팰린드롬
 * 2. 각 줄마다 주어진 수가 팰린드롬수면 'yes', 아니면 'no'를 출력 
 */
public class BAEK_1259 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer result = new StringBuffer();
		while(true) {
			String palindrome = br.readLine();
			if(palindrome.equals("0")) {
				break;
			}
			
			String chkPalindrome = checkPalindrome(palindrome);
			result.append(chkPalindrome).append("\n");
		}
		
		System.out.println(result.toString());
		
	}
	
	public static String checkPalindrome(String palindrome) {
		
		boolean flag = true;
		for(int i=0; i<palindrome.length()/2; i++) {
			if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
				flag = false;
				break;
			}
		}
		
		return flag ? "yes" : "no";
	}
}
