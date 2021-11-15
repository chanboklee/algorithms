package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11655.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.16
 * @description		:
 * 1. ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
 * 2. 첫째 줄에 알파벳 대문자, 소문자, 공백, 숫자로만 이루어진 문자열 S가 주어진다. S의 길이는 100을 넘지 않는다.
 * 3. 첫째 줄에 S를 ROT13으로 암호화한 내용을 출력 
 */
public class BAEK_11655 {
	public static void main(String[] args) throws IOException{		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		String rot13 = encryptionToRot13(S);
		System.out.println(rot13);

	}
	
	public static String encryptionToRot13(String S) {
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<S.length(); i++) {
			int chInt = S.charAt(i);
			if(chInt >= 97 && chInt <= 122) {
				if(chInt > 109) {
					result.append((char)(chInt - 13));
				}else {
					result.append((char)(chInt + 13));
				}
			}else if(chInt >= 65 && chInt <= 90) {
				if(chInt > 77) {
					result.append((char)(chInt - 13));
				}else {
					result.append((char)(chInt + 13));
				}
			}else {
				result.append(S.charAt(i));
			}
		}
		
		return result.toString();
	}
}
