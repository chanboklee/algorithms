package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ�
// 2. ù° �ٿ� ������ ���� N(1<=N<=100), ��° �ٿ� ���� N���� ������� �־�����.
public class BAEK_11720 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		int numsSum = addNums(nums);
		System.out.println(numsSum);
	}
	
	public static int addNums(String nums) {
		
		int sum = 0;
		for(int i=0; i<nums.length(); i++) {
			sum += Integer.parseInt(nums.substring(i, i+1));
		}
		
		return sum;
	}
}