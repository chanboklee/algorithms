package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_14241.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.09
 * @description		: 
 * 1. 두 슬라임 x와 y를 합쳤을 때, 합친 슬라임의 크기는 x+y 또한, 슬라임을 합칠 때 마다 두 사람은 x*y 점수를 얻게 된다.
 * 2. 점수의 최댓값
 */
public class BAEK_14241 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 슬라임의 개수
		
		String[] size = br.readLine().split(" ");
		int[] sizeArr = new int[N];
		for(int i=0; i<N; i++) {
			sizeArr[i] = Integer.parseInt(size[i]);
		}
		// 오름차순 정렬
		Arrays.sort(sizeArr);
		
		maxScore(N, sizeArr);
		
	}
	
	public static void maxScore(int N, int[] sizeArr) {
		int mul = sizeArr[N-1] * sizeArr[N-2];
		int sum = sizeArr[N-1] + sizeArr[N-2];
		int result = mul;
		if(N > 2) {
			for(int i=sizeArr.length-3; i>=0; i--) {
				mul = sum * sizeArr[i];
				sum = sum + sizeArr[i];
				result += mul;
			}			
		}
		
		System.out.println(result);		
	}
}
