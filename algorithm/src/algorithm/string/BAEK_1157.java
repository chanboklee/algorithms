package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ���, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
// 2. ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ���. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
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
