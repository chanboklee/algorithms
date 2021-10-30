package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_1946.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.30
 * @description		: 
 * 1. ���� �ɻ� ����� ���� ������ ��� �������ٸ� ���ߵ��� �ʴ´�.
 * 2. �� ���� ������ ��� 1������ N������ ������ ���� �����ȴٰ� ����
 * 3. �ű� ��� ä�뿡�� ������ �� �ִ� ���Ի���� �ִ� �ο����� ���ϴ� ���α׷��� �ۼ�
 */
public class BAEK_1946 {
	
	static BufferedReader br;
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			
			int newComerCnt = getNewComerCnt(N);
			System.out.println(newComerCnt);
		}
	}
	
	public static int getNewComerCnt(int N) throws IOException{
		
		List<RankOrder> rankList = new ArrayList<>();
		for(int j=0; j<N; j++) {
			String[] ranks = br.readLine().split(" ");
			int documentRank = Integer.parseInt(ranks[0]); 
			int interviewRank = Integer.parseInt(ranks[1]);
			rankList.add(new RankOrder(documentRank, interviewRank));
		}
		
		Collections.sort(rankList);
	
		int cnt = 1;
		int min = rankList.get(0).interviewRank;
		for(int j=1; j<rankList.size(); j++) {
			if(rankList.get(j).interviewRank < min) {
				cnt++;
				min = rankList.get(j).interviewRank;
			}
		}	
		
		return cnt;
	}
	
	static class RankOrder implements Comparable<RankOrder>{

		int documentRank;
		int interviewRank;
		
		public RankOrder(int documentRank, int interviewRank) {
			this.documentRank = documentRank;
			this.interviewRank = interviewRank;
		}
		
		@Override
		public int compareTo(RankOrder o) {
			// TODO Auto-generated method stub
			return this.documentRank - o.documentRank;
		}
	}
}
