package algorithm.string;

import java.util.Scanner;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10820.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.21
 * @description		:
 * 1. 문자열 N개가 주어진다. 이때, 문자열에 포함되어 있는 소문자, 대문자, 숫자, 공백의 개수를 구하는 프로그램을 작성
 * 2. 각 문자열은 알파벳 소문자, 대문자, 숫자, 공백으로만 이루어져 있다.
 * 3. 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력 
 */
public class BAEK_10820 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer result = new StringBuffer();
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			String findCnt = findByStringCnt(str);
			result.append(findCnt);
		}
		
		System.out.println(result.toString());
	}
	
	public static String findByStringCnt(String str) {
		
		StringBuffer cntResult = new StringBuffer();
		int[] cntArr = new int[4];
		for(int i=0; i<str.length(); i++) {
			int chInt = str.charAt(i);
			if(chInt >= 97 && chInt <= 122) {
				cntArr[0]++;
			}else if(chInt >= 65 && chInt <= 90) {
				cntArr[1]++;
			}else if(chInt >= 48 && chInt <= 57) {
				cntArr[2]++;
			}else {
				cntArr[3]++;
			}
		}
		
		cntResult.append(cntArr[0]+" "+ cntArr[1]+" "+cntArr[2]+" "+cntArr[3]).append("\n");
		return cntResult.toString();
	}
}
