package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10808.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.30
 * @description		: 
 * 1. 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 2. a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력
 * 3. 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력
 */
public class BAEK_10808 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		findAlphaIndex(word);
	}
	
	public static void findAlphaIndex(String word) {
		int[] wordAlphaArr = new int[26];				// 소문자 26개
		Arrays.fill(wordAlphaArr, -1);					// 초기 -1 설정
		boolean[] checkAlpha = new boolean[26];			// 체크 flag
		
		for(int i=0; i<word.length(); i++) {
			if(!checkAlpha[word.charAt(i)-'a']) {
				wordAlphaArr[word.charAt(i)-'a'] = i;
				checkAlpha[word.charAt(i)-'a'] = true;
			}
		}
		
		for(int alphaIndex : wordAlphaArr) {
			System.out.print(alphaIndex+" ");
		}
	}
}
