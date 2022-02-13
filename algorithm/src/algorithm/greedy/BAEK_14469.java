package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_14469.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.13
 * @description		: 
 * 1. 두 소가 동시에 검문을 받을 수는 없다.
 * 2. 한 소가 5초에 도착했고 7초 동안 검문을 받으면, 8초에 도착한 그 다음 소는 12초까지 줄을 서야 검문을 받을 수 있다.
 * 3. 모든 소가 농장에 입장하는 데 걸리는 최소 시간을 출력
 */
public class BAEK_14469 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// 소의 수
		
		List<EnterCow> enterCowList = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String[] cowInfo = br.readLine().split(" ");
			int arriveTime = Integer.parseInt(cowInfo[0]);
			int testTime = Integer.parseInt(cowInfo[1]);
			
			enterCowList.add(new EnterCow(arriveTime, testTime));
		}
		
		// 도착시간에 따른 오름차순 정렬
		Collections.sort(enterCowList);
		
		int sum = 0;
		for(int i=0; i<enterCowList.size(); i++) {
			if(enterCowList.get(i).arriveTime > sum) {
				sum = enterCowList.get(i).arriveTime + enterCowList.get(i).testTime; 
			}else {
				sum += enterCowList.get(i).testTime;
			}
		}
		
		System.out.println(sum);
	}
	
	static class EnterCow implements Comparable<EnterCow> {
		
		int arriveTime;
		int testTime;
		
		public EnterCow(int arriveTime, int testTime) {
			this.arriveTime = arriveTime;
			this.testTime = testTime;
		}
		
		@Override
		public int compareTo(EnterCow o) {
			// TODO Auto-generated method stub
			return this.arriveTime - o.arriveTime;
		}
	}
}
