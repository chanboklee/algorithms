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
 * 1. �� �Ұ� ���ÿ� �˹��� ���� ���� ����.
 * 2. �� �Ұ� 5�ʿ� �����߰� 7�� ���� �˹��� ������, 8�ʿ� ������ �� ���� �Ҵ� 12�ʱ��� ���� ���� �˹��� ���� �� �ִ�.
 * 3. ��� �Ұ� ���忡 �����ϴ� �� �ɸ��� �ּ� �ð��� ���
 */
public class BAEK_14469 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());	// ���� ��
		
		List<EnterCow> enterCowList = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String[] cowInfo = br.readLine().split(" ");
			int arriveTime = Integer.parseInt(cowInfo[0]);
			int testTime = Integer.parseInt(cowInfo[1]);
			
			enterCowList.add(new EnterCow(arriveTime, testTime));
		}
		
		// �����ð��� ���� �������� ����
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
