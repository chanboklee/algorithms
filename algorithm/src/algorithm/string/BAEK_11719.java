package algorithm.string;

import java.util.Scanner;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11719.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.18
 * @description		: 
 * 1. 입력 받은 대로 출력하는 프로그램을 작성
 * 2. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 3. 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 */
public class BAEK_11719 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer();
		while(sc.hasNextLine()) {
			sb.append(sc.nextLine()).append("\n");
		}
		sc.close();
		
		System.out.println(sb.toString());
	}
}
