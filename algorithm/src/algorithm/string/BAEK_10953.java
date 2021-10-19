package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_10953.java
 * @author			: Lee ChanBok
 * @date			: 2021.10.19
 * @description		:
 * 1. ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
 * 2. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. A�� B�� �޸�(,)�� ���еǾ� �ִ�. (0 < A, B < 10)
 * 3. �� �׽�Ʈ ���̽����� A+B�� ��� 
 */
public class BAEK_10953 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuffer resultAddNums = new StringBuffer();
		for(int i=0; i<T; i++) {
			String[] numbers = br.readLine().split(",");
			int A = Integer.parseInt(numbers[0]);
			int B = Integer.parseInt(numbers[1]);
			int num = addNum(A, B);
			
			resultAddNums.append(num).append("\n");
		}
		
		System.out.println(resultAddNums.toString());
	}
	
	public static int addNum(int A, int B) {
		return A + B;
	}
}
