package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ���
// 2. � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ���, �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ
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
