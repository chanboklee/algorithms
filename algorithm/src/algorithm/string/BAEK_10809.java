package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력
// 2. 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력, 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치
public class BAEK_10809 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int[] wordArr = new int[26];
		Arrays.fill(wordArr, -1);
		
		searchAlphaIndex(word, wordArr);

	}
	
	public static void searchAlphaIndex(String word, int[] wordArr) {
		boolean[] flag = new boolean[26];
		for(int i=0; i<word.length(); i++) {
			int alpha = word.charAt(i)-'a';
			if(!flag[alpha]) {
				wordArr[alpha] = i;
				flag[alpha] = true;				
			}
		}
		
		for(int i=0; i<wordArr.length; i++) {
			System.out.print(wordArr[i]+" ");
		}
	}
}
