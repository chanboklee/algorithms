package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_10162.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.26
 * @description		: 
 * 1. ��ư A, B, C�� ������ �ð��� ���� 5��, 1��, 10��
 * 2. �� ��ư A, B, C�� ���� Ƚ���� ���� �׻� �ּ�
 * 3. T�ʸ� ���� �ּҹ�ư ������ A B C Ƚ���� ù �ٿ� ���ʴ�� ����ؾ� �Ѵ�. ������ Ƚ�� ���̿��� �� ĭ�� �д�.
 * 4. �ش� ��ư�� ������ �ʴ� ��쿡�� ���� 0�� ����ؾ��Ѵ�. ���� ���õ� 3���� ��ư���� T�ʸ� ���� �� ������ ���� -1�� ù �ٿ� ���
 */
public class BAEK_10162 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		int[] buttonTimes = {300, 60, 10};		
		pressButtonCnt(T, buttonTimes);
	
	}
	
	public static void pressButtonCnt(int T, int[] buttonTimes) {
		int[] buttonTimesArr = new int[3];
		
		int cnt = 0;
		for(int i=0; i<buttonTimes.length; i++) {
			if(T >= buttonTimes[i]) {
				cnt = T / buttonTimes[i];
				T = T % buttonTimes[i];
			}else {
				cnt = 0;
			}
			
			buttonTimesArr[i] = cnt;
			
		}	
		
		if(T == 0) {
			for(int result : buttonTimesArr) {
				System.out.print(result+" ");
			}
		}else {
			System.out.println("-1");
		}
	}
}
