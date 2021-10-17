package algorithm.string;

import java.util.Scanner;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11719.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.18
 * @description		: 
 * 1. �Է� ���� ��� ����ϴ� ���α׷��� �ۼ�
 * 2. �Է��� �ִ� 100�ٷ� �̷���� �ְ�, ���ĺ� �ҹ���, �빮��, ����, ���ڷθ� �̷���� �ִ�.
 * 3. �� ���� 100���ڸ� ���� ������, �� ���� �־��� ���� �ְ�, �� ���� �� �ڿ� ������ ���� ���� �ִ�.
 */
public class BAEK_11719 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer();
		while(sc.hasNextLine()) {
			sb.append(sc.nextLine()).append("\n");
		}
		sc.close();
		
		System.out.println(sb.toString());
	}
}
