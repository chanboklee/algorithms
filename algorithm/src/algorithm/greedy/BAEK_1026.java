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
 * 1. S = A[0]��B[0] + ... + A[N-1]��B[N-1]
 * 2. S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
 * 3. S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ�
 * 4. N�� 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
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
