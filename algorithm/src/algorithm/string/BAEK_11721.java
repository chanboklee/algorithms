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
 * 1. �ܾ�� ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ������, ���̴� 100�� ���� �ʴ´�. ���̰� 0�� �ܾ�� �־����� �ʴ´�.
 * 2. �Է����� �־��� �ܾ �� ���� ��� �� �ٿ� �ϳ��� ���
 * 3. �ܾ��� ���̰� 10�� ����� �ƴ� ��쿡�� ������ �ٿ��� 10�� �̸��� ���ڸ� ��� 
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
