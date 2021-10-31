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
 * 1. ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * 2. a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ���
 * 3. ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ���
 */
public class BAEK_10808 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		findAlphaIndex(word);
	}
	
	public static void findAlphaIndex(String word) {
		int[] wordAlphaArr = new int[26];				// �ҹ��� 26��
		Arrays.fill(wordAlphaArr, -1);					// �ʱ� -1 ����
		boolean[] checkAlpha = new boolean[26];			// üũ flag
		
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
