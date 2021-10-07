package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
// 2. "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
public class BAEK_8958 { 
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuffer scores = new StringBuffer();
		for(int i=0; i<N; i++) {
			String ox = br.readLine();
			int score = solveScore(ox);
			scores.append(score).append("\n");
		}
		
		System.out.println(scores.toString());
	}
	
	public static int solveScore(String ox) {
		int oCnt = 0;
		int oSum = 0;
		for(int j=0; j<ox.length(); j++) {
			char oxChar = ox.charAt(j);
			if(oxChar == 'O') {
				oCnt++;
				oSum += oCnt;
			}else {
				oCnt = 0;
			}
		}
		return oSum;
	}
}
