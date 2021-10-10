package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성단, 대문자와 소문자를 구분하지 않는다.
// 2. 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
public class BAEK_1157 {
	static int[] wordArr;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toLowerCase();
		
		wordArr = new int[26];
		for(int i=0; i<word.length(); i++) {
			wordArr[word.charAt(i)-'a']++;
		}
		
		int maxValue = 0;
		for(int i=0; i<wordArr.length; i++) {
			maxValue = Math.max(maxValue, wordArr[i]);
		}
		
		String toManyAlpha = printToManyAlpha(maxValue);
		System.out.println(toManyAlpha);
		
	}
	
	public static String printToManyAlpha(int maxValue) {
		
		int maxValueCnt = 0;
		String resultString = "";
		for(int i=0; i<wordArr.length; i++) {
			if(wordArr[i] == maxValue) {
				maxValueCnt++;
				resultString = String.valueOf((char)(i+65));
			}
		}
		
		return maxValueCnt > 1 ? "?" : resultString;

	}
}
