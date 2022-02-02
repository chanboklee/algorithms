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
 * 1. 1,5,10���� �ø��� ������ ��ư�� �ִ�.
 * 2. ���� ���� �µ��� �����ϰ����ϴ� ��ǥ �µ��� �־����� �� ��ư�� �̿��Ͽ� ��ǥ �µ��� ����
 * 3. ��ư ������ �ּ� Ƚ�� 
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
		int a = Integer.parseInt(nums[0]);	// ���� ���� �µ�
		int b = Integer.parseInt(nums[1]);	// ��ǥ �µ�
		
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
