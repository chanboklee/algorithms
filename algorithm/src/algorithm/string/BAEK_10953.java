package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10953.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.19
 * @description		:
 * 1. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 2. 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 * 3. 각 테스트 케이스마다 A+B를 출력 
 */
public class BAEK_10953 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuffer resultAddNums = new StringBuffer();
		for(int i=0; i<T; i++) {
			String[] numbers = br.readLine().split(",");
			int A = Integer.parseInt(numbers[0]);
			int B = Integer.parseInt(numbers[1]);
			int num = addNum(A, B);
			
			resultAddNums.append(num).append("\n");
		}
		
		System.out.println(resultAddNums.toString());
	}
	
	public static int addNum(int A, int B) {
		return A + B;
	}
}
