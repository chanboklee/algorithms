package codeup.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: codeup.greedy
 * @fileName		: CODEUP_3301.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.03
 * @description		:
 * 1. 거스름돈을 입력 받아 점원이 줄 수 있는 최소 거스름돈의 개수를 출력
 * 2. 50,000원 10,000원 5,000원 1,000원 500원 100원 50원 10원 
 */
public class CODEUP_3301 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int n = Integer.parseInt(br.readLine());	// 거스름돈 n
		
		int idx = 0;
		int count = 0;
		while(n != 0) {
			if(n >= moneys[idx]) {
				count += n / moneys[idx];
				n = n % moneys[idx];
			}
			idx++;
		}
		
		System.out.println(count);
	}
}
