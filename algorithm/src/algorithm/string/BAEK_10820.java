package algorithm.string;

import java.util.Scanner;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10820.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.21
 * @description		:
 * 1. ���ڿ� N���� �־�����. �̶�, ���ڿ��� ���ԵǾ� �ִ� �ҹ���, �빮��, ����, ������ ������ ���ϴ� ���α׷��� �ۼ�
 * 2. �� ���ڿ��� ���ĺ� �ҹ���, �빮��, ����, �������θ� �̷���� �ִ�.
 * 3. ù° �ٺ��� N��° �ٱ��� ������ ���ڿ��� ���ؼ� �ҹ���, �빮��, ����, ������ ������ �������� ������ ��� 
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
