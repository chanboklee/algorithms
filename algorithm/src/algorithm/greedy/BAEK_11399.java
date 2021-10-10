package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. ���� �� �ִ� ����� �� N�� �� ����� ���� �����ϴµ� �ɸ��� �ð� Pi�� �־����� ��, 
// �� ����� ���� �����ϴµ� �ʿ��� �ð��� ���� �ּڰ��� ���ϴ� ���α׷��� �ۼ�
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
		
		// �������� ����
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
