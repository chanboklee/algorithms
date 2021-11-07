package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_2902.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.07
 * @description		:
 * 1. ù ��°�� ���� ��� ����, �̸� ������(-)���� �̾� ���� ���̴�. ���� ���, Knuth-Morris-Pratt�̴�. �̰��� �� ����
 * 2. �� ��°�� ª�� ���´� ���� ����� ���� ù ���ڸ� ���� �θ��� ���̴�. ���� ���, KMP 
 */
public class BAEK_2902 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] splitName = br.readLine().split("-");
		String resultConvShortName = convShortName(splitName);
		
		System.out.println(resultConvShortName);
	}
	
	public static String convShortName(String[] splitName) {
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<splitName.length; i++) {
			char chName = splitName[i].charAt(0);
			result.append(chName);
		}
		
		return result.toString();
	}
}
