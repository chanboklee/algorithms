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
 * 1. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
 * 2. 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력 
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
