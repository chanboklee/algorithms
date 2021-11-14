package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10798.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.14
 * @description		: 
 * 1. �� �ټ����� �Է��� �־�����. �� �ٿ��� �ּ� 1��, �ִ� 15���� ���ڵ��� ��ĭ ���� �������� �־�����.
 * 2. �־����� ���ڴ� ���� �빮�� ��A������ ��Z��, ���� �ҹ��� ��a������ ��z��, ���� ��0������ ��9�� �� �ϳ��̴�. �� ���� ���۰� �������� ��ĭ�� ����.
 * 3. �����̰� ���η� ���� ������� ���ڵ��� ����Ѵ�. �̶�, ���ڵ��� ���� ���� �����ؼ� ���
 */
public class BAEK_10798 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] toyCharArr = new char[5][15];
		for(int i=0; i<5; i++) {
			String toy = br.readLine();
			for(int j=0; j<toy.length(); j++) {
				toyCharArr[i][j] = toy.charAt(j);
			}
		}
		
		verticalRead(toyCharArr);

	}
	
	public static void verticalRead(char[][] toyCharArr) {
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(toyCharArr[j][i] == '\0') {
					continue;
				}
				result.append(toyCharArr[j][i]);
			}
		}
		
		System.out.println(result.toString());
	}
}
