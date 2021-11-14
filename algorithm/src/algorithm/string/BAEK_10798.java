package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10798.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.14
 * @description		: 
 * 1. 총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
 * 2. 주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.
 * 3. 영석이가 세로로 읽은 순서대로 글자들을 출력한다. 이때, 글자들을 공백 없이 연속해서 출력
 */
public class BAEK_10798 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] toyCharArr = new char[5][15];
		for(int i=0; i<5; i++) {
			String toy = br.readLine();
			for(int j=0; j<toy.length(); j++) {
				toyCharArr[i][j] = toy.charAt(j);
			}
		}
		
		verticalRead(toyCharArr);

	}
	
	public static void verticalRead(char[][] toyCharArr) {
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(toyCharArr[j][i] == '\0') {
					continue;
				}
				result.append(toyCharArr[j][i]);
			}
		}
		
		System.out.println(result.toString());
	}
}
