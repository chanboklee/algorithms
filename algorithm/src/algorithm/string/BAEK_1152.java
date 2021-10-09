package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. �� ���ڿ����� �� ���� �ܾ ������? (��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�)
// 2. ù �ٿ� ���� ��ҹ��ڿ� �������� �̷���� ���ڿ��� �־�����.
// 3. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ��� �������� �����ϰų� ���� �� �ִ�.
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
