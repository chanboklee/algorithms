package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11656.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.13
 * @description		: 
 * 1. 문자열 S의 접미사를 사전순으로 정렬하여 출력
 */
public class BAEK_11656 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String suffix = br.readLine();
		
		sortSuffix(suffix);
	}
	
	public static void sortSuffix(String suffix) {
		
		List<String> suffixList = new ArrayList<>();
		for(int i=0; i<suffix.length(); i++) {
			suffixList.add(suffix.substring(i));	
		}
		
		Collections.sort(suffixList);
		for(String result : suffixList) {
			System.out.println(result);
		}		
	}
}
