package algorithm.string;

import java.io.IOException;
import java.util.Scanner;

// 1. 입력 받은 대로 출력하는 프로그램을 작성
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
