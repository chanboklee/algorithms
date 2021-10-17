package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1427.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.18
 * @description		: 
 * 1. ù° �ٿ� �����Ϸ��� �ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ���
 * 2. ù° �ٿ� �ڸ����� ������������ ������ ���� ���
 */
public class BAEK_1427 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		sortDesc(N);

	}
	
	public static void sortDesc(String N) {
		
		int[] sortArr = new int[10];
		
		for(int i=0; i<N.length(); i++) {
			int ch = N.charAt(i)-'0';
			sortArr[ch]++;
		}
		
		for(int i=sortArr.length-1; i>=0; i--) {
			if(sortArr[i] != 0) {
				for(int j=0; j<sortArr[i]; j++) {
					System.out.print(i);
				}
			}
		}
	}
}
