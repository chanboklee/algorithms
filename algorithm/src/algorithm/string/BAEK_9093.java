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
 * 1. ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����.
 * 2. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
 * 3. �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
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
