package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
// 2. 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성
// 3. 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
public class BAEK_11047 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] infos = br.readLine().split(" ");
		
		int N = Integer.parseInt(infos[0]);
		int K = Integer.parseInt(infos[1]);
		
		int[] coinsArr = new int[N];
		for(int i=0; i<N; i++) {
			int coin = Integer.parseInt(br.readLine());
			coinsArr[i] = coin;
		}
		
		int coinMinCnt = makeCoinMinCnt(coinsArr, K);
		System.out.println(coinMinCnt);
	}
	
	public static int makeCoinMinCnt(int[] coinsArr, int K) {
		
		int coinsArrIdx = coinsArr.length-1;
		int cnt = 0;
		while(K != 0) {
			if(coinsArr[coinsArrIdx] <= K) {
				cnt += K / coinsArr[coinsArrIdx];
				K = K % coinsArr[coinsArrIdx];
			}	
			coinsArrIdx--;
		}
		
		return cnt;
	}
}
