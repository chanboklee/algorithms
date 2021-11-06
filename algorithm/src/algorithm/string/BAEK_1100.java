package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1100.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.06
 * @description		:
 * 1. 체스판은 8×8크기이고, 검정 칸과 하얀 칸이 번갈아가면서 색칠되어 있다. 
 * 2. 가장 왼쪽 위칸 (0,0)은 하얀색이다.
 * 3. ‘.’은 빈 칸이고, ‘F’는 위에 말이 있는 칸이다.
 * 4. 체스판의 상태가 주어졌을 때, 하얀 칸 위에 말이 몇 개 있는지 출력하는 프로그램을 작성
 */
public class BAEK_1100 {
	
	static BufferedReader br;
	public static void main(String[] args) throws IOException{
		
		br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = whiteHorseCnt();

		System.out.println(cnt);
	}
	
	public static int whiteHorseCnt() throws IOException {
		
		int whiteHorseCnt = 0;
		for(int i=1; i<=8; i++) {
			String chess = br.readLine();
			if(i % 2 == 0) {
				for(int j=0; j<chess.length(); j++) {
					char horse = chess.charAt(j);
					if(horse == 'F' && (j+1) % 2 == 0) {
						whiteHorseCnt++;
					}
				}				
			}else {
				for(int j=0; j<chess.length(); j++) {
					char horse = chess.charAt(j);
					if(horse == 'F' && (j+1) % 2 != 0) {
						whiteHorseCnt++;
					}
				}
			}
		}
		
		return whiteHorseCnt;
	}
}
