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
 * 1. �Ӹ�����̶� ������ ���� ���� �Ųٷ� ���� �� �Ȱ��� �ܾ ���Ѵ�.
 * 2. �ܾ��� ���̴� 1���� ũ�ų� ����, 100���� �۰ų� ������, ���ĺ� �ҹ���
 * 3. ù° �ٿ� �Ӹ�����̸� 1, �ƴϸ� 0�� ��� 
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
