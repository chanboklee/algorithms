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
 * 1. 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는 , 6으로 볼때도 있지만, 5로 잘못 볼 수도있다.
 * 2. 두 수 A와 B가 주어졌을 때, 두 수의 가능한 합 중, 최소값과 최대값을 출력
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
