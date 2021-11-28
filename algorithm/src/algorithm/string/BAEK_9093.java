package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_9093.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.29
 * @description		: 
 * 1. 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다.
 * 2. 단어는 영어 알파벳으로만 이루어져 있다.
 * 3. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
 */
public class BAEK_9093 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuffer reverseWord = new StringBuffer();
		for(int i=0; i<T; i++) {
			String[] word = br.readLine().split(" ");
			for(int j=0; j<word.length; j++) {
				for(int k=word[j].length()-1; k>=0; k--) {
					reverseWord.append(word[j].charAt(k));
				}
				reverseWord.append(" ");
			}
			reverseWord.append("\n");
		}
		
		System.out.println(reverseWord.toString());
	}
}
