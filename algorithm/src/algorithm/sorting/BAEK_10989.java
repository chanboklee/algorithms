package algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: algorithm.sorting
 * @fileName		: BAEK_10989.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.21
 * @description		:
 * 1. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ�
 * 2. ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ��� 
 */
public class BAEK_10989 {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] numArr = new int[N];
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[i] = num;
		}
		
		Arrays.sort(numArr);
		StringBuffer sortResultNum = new StringBuffer();
		for(int ascNum : numArr) {
			sortResultNum.append(ascNum).append("\n");
		}
		System.out.println(sortResultNum.toString());
	}
}
