package algorithm.string;

import java.io.IOException;
import java.util.Scanner;

// 1. �Է� ���� ��� ����ϴ� ���α׷��� �ۼ�
public class BAEK_11718 {
	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer inputs = new StringBuffer();
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			inputs.append(input).append("\n");
		}
		
		System.out.println(inputs.toString());
	}
}
