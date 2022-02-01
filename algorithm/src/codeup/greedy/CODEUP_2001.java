package codeup.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: codeup.greedy
 * @fileName		: CODEUP_2001.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.01
 * @description		: 
 * 1. �Ľ�Ÿ�� ������ �꽺�� ������ �־����� ��, �� �� ��Ʈ �޴��� ����� �ּҰ�
 * 2. �Ľ�Ÿ, ������ �꽺 ������ �ּҰ��� ���ϸ� �ȴ�.
 */
public class CODEUP_2001 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		float pasta = Integer.MAX_VALUE;
		float juice = Integer.MAX_VALUE;
		float totalPrice = 0;
		for(int i=0; i<5; i++) {
			int price = Integer.parseInt(br.readLine());
			if(i<3) {
				// �Ľ�Ÿ
				pasta = Math.min(pasta, price);
			}else {
				// ������ �꽺
				juice = Math.min(juice, price);
			}
		}
		
		totalPrice = pasta + juice + ((pasta + juice) / 10);
		System.out.println("totalPrice="+totalPrice);
		
	}
}
