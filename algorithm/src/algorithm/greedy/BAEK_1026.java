package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_1026.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.17
 * @description		: 
 * 1. S = A[0]×B[0] + ... + A[N-1]×B[N-1]
 * 2. S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
 * 3. S의 최솟값을 출력하는 프로그램을 작성
 * 4. N은 50보다 작거나 같은 자연수이고, A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
 */
public class BAEK_1026 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		
		int minSum = getMinSum(a, b, N);		
		System.out.println(minSum);
	}
	
	public static int getMinSum(String[] a, String[] b, int N) {
		
		PriorityQueue<Integer> aPriorityQueue = new PriorityQueue<>();
		int[] bArr = new int[101];
		
		for(int i=0; i<N; i++) {
			aPriorityQueue.offer(Integer.parseInt(a[i]));
			bArr[Integer.parseInt(b[i])]++;
		}
		
		int minSum = 0;
		for(int i=bArr.length-1; i>=0; i--) {
			if(bArr[i] != 0) minSum += aPriorityQueue.poll() * i; 
		}
		
		return minSum;
	}
}
