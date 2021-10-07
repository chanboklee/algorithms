package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성
// 2. 첫째 줄에 숫자의 개수 N(1<=N<=100), 둘째 줄에 숫자 N개가 공백없이 주어진다.
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