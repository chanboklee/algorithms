package codeup.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: codeup.greedy
 * @fileName		: CODEUP_3321.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.07
 * @description		: 
 * 1. 1달러 당 열량이 최대가 되는 피자를 주문, 이러한 피자를 "최고의 피자"
 * 2. 같은 토핑을 2개 이상 올릴 수 없다. 도우에 토핑을 하나도 하지 않은 피자도 주문할 수 있다.
 */
public class CODEUP_3321 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int toppingCnt = Integer.parseInt(br.readLine());	// 토핑의 수
		String[] prices = br.readLine().split(" ");
		
		int doughPrice = Integer.parseInt(prices[0]);		// 도우 가격
		int toppingPrice = Integer.parseInt(prices[1]);		// 토핑 가격
		
		int doughKcal = Integer.parseInt(br.readLine());	// 도우 칼로리
		
		int[] toppingKcalArr = new int[toppingCnt];			// 도우 칼로리를 담을 배열
		for(int i=0; i<toppingCnt; i++) {
			toppingKcalArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(toppingKcalArr);						// 도우 오름차순 정렬						

		int result = bestPizzaKcal(doughKcal, doughPrice, toppingPrice, toppingKcalArr);
		System.out.println(result);
	}
	
	public static int bestPizzaKcal(int doughKcal, int doughPrice, int toppingPrice, int[] toppingKcalArr) {
		int max = doughKcal / doughPrice;
		int kcalSum = doughKcal;
		int priceSum = doughPrice;
		
		for(int i=toppingKcalArr.length-1; i>=0; i--) {
			kcalSum += toppingKcalArr[i];
			priceSum += toppingPrice;
			max = Math.max(max, (kcalSum / priceSum));
		}
		
		return max;
	}
}
