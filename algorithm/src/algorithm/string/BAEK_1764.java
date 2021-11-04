package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1764.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.04
 * @description		: 
 * 1. 듣도 못한 사람의 명단, 보도 못한 사람의 명단에는 중복되는 이름이 없다.
 * 2. 듣보잡의 수와 그 명단을 사전순으로 출력
 */
public class BAEK_1764 { 
	static BufferedReader br;
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] infos = br.readLine().split(" ");
		int N = Integer.parseInt(infos[0]);
		int M = Integer.parseInt(infos[1]);
		
		String result = noHearAndSeeList(N, M);
		System.out.println(result);
		
	}
	
	public static String noHearAndSeeList(int noHearLen, int noSeeLen) throws IOException {
		
		Set<String> noHearPeople = new HashSet<>();
		List<String> noHearAndSeeList = new ArrayList<>();
		for(int i=0; i<noHearLen+noSeeLen; i++) {
			String people = br.readLine();
			if(i < noHearLen) {
				noHearPeople.add(people);
			}else {
				if(noHearPeople.contains(people)) {
					noHearAndSeeList.add(people);
				}
			}
		}
		
		StringBuffer result = new StringBuffer();
		Collections.sort(noHearAndSeeList);
		
		result.append(noHearAndSeeList.size()).append("\n");
		for(String noHearAndSeePeople : noHearAndSeeList) {
			result.append(noHearAndSeePeople).append("\n");
		}
		
		return result.toString();
	}
}
