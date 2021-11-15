package algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: algorithm.sorting
 * @fileName		: BAEK_1427.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.16
 * @description		:
 * 1. ù° �ٿ� �����Ϸ��� �ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ���
 * 2. ù° �ٿ� �ڸ����� ������������ ������ ���� ��� 
 */
public class BAEK_1427 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		sortNumDesc(N);
	}
	
	public static void sortNumDesc(String N) {
		int[] numArr = new int[N.length()];
		for(int i=0; i<N.length(); i++) {
			int num = N.charAt(i)-'0';
			numArr[i] = num;
		}
	
		Arrays.sort(numArr);
		
		for(int i=numArr.length-1; i>=0; i--) {
			System.out.print(numArr[i]);
		}
	}
}
