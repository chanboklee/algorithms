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
 * 1. 1�޷� �� ������ �ִ밡 �Ǵ� ���ڸ� �ֹ�, �̷��� ���ڸ� "�ְ��� ����"
 * 2. ���� ������ 2�� �̻� �ø� �� ����. ���쿡 ������ �ϳ��� ���� ���� ���ڵ� �ֹ��� �� �ִ�.
 */
public class CODEUP_3321 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int toppingCnt = Integer.parseInt(br.readLine());	// ������ ��
		String[] prices = br.readLine().split(" ");
		
		int doughPrice = Integer.parseInt(prices[0]);		// ���� ����
		int toppingPrice = Integer.parseInt(prices[1]);		// ���� ����
		
		int doughKcal = Integer.parseInt(br.readLine());	// ���� Į�θ�
		
		int[] toppingKcalArr = new int[toppingCnt];			// ���� Į�θ��� ���� �迭
		for(int i=0; i<toppingCnt; i++) {
			toppingKcalArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(toppingKcalArr);						// ���� �������� ����						

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
