package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. 줄을 서 있는 사람의 수 N과 각 사람이 돈을 인출하는데 걸리는 시간 Pi가 주어졌을 때, 
// 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값을 구하는 프로그램을 작성
public class BAEK_11399 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] times = br.readLine().split(" ");
		
		int minSum = withdrawMin(N, times);
		System.out.println(minSum);
		
	}
	
	public static int withdrawMin(int N, String[] times) {
		int[] timesArr = new int[N];
		for(int i=0; i<times.length; i++) {
			timesArr[i] = Integer.parseInt(times[i]);
		}
		
		// 오름차순 정렬
		Arrays.sort(timesArr);
		
		int tempSum = 0;
		int sum = 0;
		for(int i=0; i<timesArr.length; i++) {
			tempSum += timesArr[i];
			sum += tempSum;
		}
		
		return sum;
	}
}
