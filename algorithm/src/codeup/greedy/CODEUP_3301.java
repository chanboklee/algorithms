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
 * 1. �Ž������� �Է� �޾� ������ �� �� �ִ� �ּ� �Ž������� ������ ���
 * 2. 50,000�� 10,000�� 5,000�� 1,000�� 500�� 100�� 50�� 10�� 
 */
public class CODEUP_3301 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int n = Integer.parseInt(br.readLine());	// �Ž����� n
		
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
