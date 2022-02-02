package codeup.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @packageName		: codeup.greedy
 * @fileName		: CODEUP_3120.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.02
 * @description		:
 * 1. 1,5,10도를 올리고 내리는 버튼이 있다.
 * 2. 현재 설정 온도와 변경하고자하는 목표 온도가 주어지면 이 버튼을 이용하여 목표 온도를 변경
 * 3. 버튼 누름의 최소 횟수 
 */
public class CODEUP_3120 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> needsMap = new HashMap<>();
		needsMap.put(0, 0);
		needsMap.put(1, 1);
		needsMap.put(2, 2);
		needsMap.put(3, 3);
		needsMap.put(4, 2);
		needsMap.put(5, 1);
		needsMap.put(6, 2);
		needsMap.put(7, 3);
		needsMap.put(8, 3);
		needsMap.put(9, 2);
		needsMap.put(10, 1);
		
		String[] nums = br.readLine().split(" ");
		int a = Integer.parseInt(nums[0]);	// 현재 설정 온도
		int b = Integer.parseInt(nums[1]);	// 목표 온도
		
		int cnt = 0;
		if(a > b) {
			while(true) {
				if(a-b > 10) {
					cnt++;
					b += 10;
				}else {
					cnt += needsMap.get(a-b);
					break;	
				}
			}
		}else if(b > a) {
			while(true) {
				if(b-a > 10) {
					cnt++;
					a += 10;
				}else {
					cnt += needsMap.get(b-a);
					break;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
