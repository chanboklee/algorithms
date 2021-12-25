package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_7567.java
 * @author			: Lee ChanBok
 * @date			: 2021.12.26
 * @description		:
 * 1. �� ���� �׸��� ���� �������� ������ �� ���̴� 5cm�� ����
 * 2. �׸��� ���� �ݴ�������� ���̸� ���̴� �׸���ŭ, �� 10cm�� ����
 * 3. ó�� �Է����� �־��� �� �׸��� ������ �ٲ� �� ����. 
 * 4. ���ڿ��� ���̴� 3�̻� 50 ����
 * 5. �׸� ������ ��ȣ ���ڷ� ǥ�õ� ���ڿ��� �о �� ������ ���̸� ������ ���
 */
public class BAEK_7567 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bowlDirections = br.readLine();
		
		int resultBowlMaxHeight = bowlMaxHeight(bowlDirections);
		System.out.println(resultBowlMaxHeight);
	}
	
	public static int bowlMaxHeight(String bowlDirections) {
		int initBowlHeight = 10;
		for(int i=1; i<bowlDirections.length(); i++) {
			if(bowlDirections.charAt(i-1) == bowlDirections.charAt(i)) {
				initBowlHeight += 5;
			}else {
				initBowlHeight += 10;
			}
		}
		
		return initBowlHeight;
	}
}
