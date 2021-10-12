package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. ������ ������ ����ؼ� �� ��ġ�� ���� K�� ������� �Ѵ�.
// 2. �ʿ��� ���� ������ �ּڰ��� ���ϴ� ���α׷��� �ۼ�
// 3. ��° �ٺ��� N���� �ٿ� ������ ��ġ Ai�� ������������ �־�����.
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
