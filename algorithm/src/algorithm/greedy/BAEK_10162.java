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
 * 1. 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초
 * 2. 단 버튼 A, B, C를 누른 횟수의 합은 항상 최소
 * 3. T초를 위한 최소버튼 조작의 A B C 횟수를 첫 줄에 차례대로 출력해야 한다. 각각의 횟수 사이에는 빈 칸을 둔다.
 * 4. 해당 버튼을 누르지 않는 경우에는 숫자 0을 출력해야한다. 만일 제시된 3개의 버튼으로 T초를 맞출 수 없으면 음수 -1을 첫 줄에 출력
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
