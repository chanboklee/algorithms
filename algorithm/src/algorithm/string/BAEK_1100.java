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
 * 1. ü������ 8��8ũ���̰�, ���� ĭ�� �Ͼ� ĭ�� �����ư��鼭 ��ĥ�Ǿ� �ִ�. 
 * 2. ���� ���� ��ĭ (0,0)�� �Ͼ���̴�.
 * 3. ��.���� �� ĭ�̰�, ��F���� ���� ���� �ִ� ĭ�̴�.
 * 4. ü������ ���°� �־����� ��, �Ͼ� ĭ ���� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ�
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
