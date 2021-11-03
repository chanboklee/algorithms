package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_2743.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.03
 * @description		:
 * 1. 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성 
 */
public class BAEK_2743 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int wordLen = br.readLine().length();
		System.out.println(wordLen);
		
	}
}
