package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1427.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.18
 * @description		: 
 * 1. 첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수
 * 2. 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력
 */
public class BAEK_1427 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		sortDesc(N);

	}
	
	public static void sortDesc(String N) {
		
		int[] sortArr = new int[10];
		
		for(int i=0; i<N.length(); i++) {
			int ch = N.charAt(i)-'0';
			sortArr[ch]++;
		}
		
		for(int i=sortArr.length-1; i>=0; i--) {
			if(sortArr[i] != 0) {
				for(int j=0; j<sortArr[i]; j++) {
					System.out.print(i);
				}
			}
		}
	}
}
