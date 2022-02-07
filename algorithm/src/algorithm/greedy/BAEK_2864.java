package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_2864.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.08
 * @description		: 
 * 1. ���� 5�� �� ��, 5�� �� ���� ������, 6���� �߸� �� ���� �ְ�, 6�� �� ���� , 6���� ������ ������, 5�� �߸� �� �����ִ�.
 * 2. �� �� A�� B�� �־����� ��, �� ���� ������ �� ��, �ּҰ��� �ִ밪�� ���
 */
public class BAEK_2864 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] nums = br.readLine().split(" ");
		minAndMax(nums);

	}
	
	public static void minAndMax(String[] nums) {
		
		int aMin = Integer.parseInt(nums[0].replace('6', '5'));
		int aMax = Integer.parseInt(nums[0].replace('5', '6'));
		
		int bMin = Integer.parseInt(nums[1].replace('6', '5'));
		int bMax = Integer.parseInt(nums[1].replace('5', '6'));		
		
		System.out.println((aMin+bMin)+" "+(aMax+bMax));
	}
}
