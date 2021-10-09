package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. 이 문자열에는 몇 개의 단어가 있을까? (단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다)
// 2. 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
// 3. 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
public class BAEK_1152 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] words = br.readLine().split(" ");
		
		int wordsCnt = chkWordsCnt(words);
		System.out.println(wordsCnt);
	}
	
	public static int chkWordsCnt(String[] words) {
		
		int wordsCnt = 0;
		for(int i=0; i<words.length; i++) {
			if(i == 0) {
				if(words[i].equals("")) {
					continue;
				}else {
					wordsCnt++;
				}
			}else {
				wordsCnt++;
			}
		}
		
		return wordsCnt;
	}
}
