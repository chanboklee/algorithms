package algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.sorting
 * @fileName		: BAEK_2751.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.19
 * @description		:
 * 1. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ�
 * 2. ù° �ٿ� ���� ���� N(1 �� N �� 1,000,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �־�����.
 * 3. �� ���� ������ 1,000,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * 4. ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ��� 
 */
public class BAEK_2751 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] numArr = new int[2000001];
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			numArr[1000000+num]++;
		}
		
		StringBuffer resultSortAscNum = new StringBuffer();
		for(int i=0; i<numArr.length; i++) {
			if(numArr[i] != 0) {
				resultSortAscNum.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(resultSortAscNum.toString());
	}
}
