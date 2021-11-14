package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10988.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.14
 * @description		:
 * 1. 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * 2. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자
 * 3. 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력 
 */
public class BAEK_10988 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String palindrome = checkPalindrome(word);
		
		System.out.println(palindrome);
		
	}
	
	public static String checkPalindrome(String word) {
		
		boolean flag = true;
		for(int i=0; i<word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-i-1)) {
				flag = false;
				break;
			}
		}
		
		return flag ? "1" : "0";
	}
}
