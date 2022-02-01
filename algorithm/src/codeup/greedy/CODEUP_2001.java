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
 * 1. 파스타와 생과일 쥬스의 가격이 주어졌을 때, 그 날 세트 메뉴의 대금의 최소값
 * 2. 파스타, 생과일 쥬스 각각의 최소값을 구하면 된다.
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
				// 파스타
				pasta = Math.min(pasta, price);
			}else {
				// 생과일 쥬스
				juice = Math.min(juice, price);
			}
		}
		
		totalPrice = pasta + juice + ((pasta + juice) / 10);
		System.out.println("totalPrice="+totalPrice);
		
	}
}
