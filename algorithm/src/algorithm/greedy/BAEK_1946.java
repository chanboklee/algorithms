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
 * 1. 서류 심사 결과와 면접 성적이 모두 떨어진다면 선발되지 않는다.
 * 2. 두 성적 순위는 모두 1위부터 N위까지 동석차 없이 결정된다고 가정
 * 3. 신규 사원 채용에서 선발할 수 있는 신입사원의 최대 인원수를 구하는 프로그램을 작성
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
