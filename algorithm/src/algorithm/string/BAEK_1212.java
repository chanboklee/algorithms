package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1212.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.13
 * @description		: 
 * 1. 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성
 * 2. 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 * 3. 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작
 */
public class BAEK_1212 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		convOctToBinary(num);
	}
	
	public static void convOctToBinary(String num) {
		
		String[] binaryStrArr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		StringBuffer result = new StringBuffer();
		for(int i=0; i<num.length(); i++) {
			int number = num.charAt(i)-'0';
			if(i==0) {
				result.append(Integer.parseInt(binaryStrArr[number]));
			}else {
				result.append(binaryStrArr[number]);
			}
		}
		
		System.out.println(result.toString());
	}
}
