package algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성
// 2. 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다.
// 3. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
public class BAEK_2750 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		for(int i=0; i<N; i++) {
			String num = br.readLine();
			numArr[i] = Integer.parseInt(num);
		}
		
		// 오름차순
		Arrays.sort(numArr);
		
		for(int sortNum : numArr) {
			System.out.println(sortNum);
		}
	}
}
