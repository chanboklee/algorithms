package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11721.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.17
 * @description		: 
 * 1. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다. 길이가 0인 단어는 주어지지 않는다.
 * 2. 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력
 * 3. 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력 
 */
public class BAEK_11721 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		String convStr = convToTenString(word);
		System.out.println(convStr);
	}
	
	public static String convToTenString(String word) {
		
		StringBuffer words = new StringBuffer();
		for(int i=0; i<word.length(); i+=10) {
			if((i+10) > word.length()) {
				words.append(word.substring(i)).append("\n");
			}else {
				words.append(word.substring(i, i+10)).append("\n");
			}
		}
		
		return words.toString();
	}
}
