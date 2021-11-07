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
 * 1. 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태
 * 2. 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르는 것이다. 예를 들면, KMP 
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
