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
 * 1. 두 개의 그릇을 같은 방향으로 포개면 그 높이는 5cm만 증가
 * 2. 그릇이 서로 반대방향으로 쌓이면 높이는 그릇만큼, 즉 10cm만 증가
 * 3. 처음 입력으로 주어진 각 그릇의 방향은 바꿀 수 없다. 
 * 4. 문자열의 길이는 3이상 50 이하
 * 5. 그릇 방향이 괄호 문자로 표시된 문자열을 읽어서 그 최종의 높이를 정수로 출력
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
