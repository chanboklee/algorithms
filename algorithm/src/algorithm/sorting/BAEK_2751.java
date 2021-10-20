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
 * 1. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
 * 2. 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 3. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 * 4. 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력 
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
