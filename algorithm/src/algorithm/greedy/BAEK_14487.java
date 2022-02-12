package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @packageName		: algorithm.greedy
 * @fileName		: BAEK_14487.java
 * @author			: Lee ChanBok
 * @date			: 2022.02.12
 * @description		:
 * 1. 임의의 A마을에서 임의의 B마을로 가기 위해서는 왼쪽 또는 오른쪽 도로를 통해 해안가를 따라 섬을 돌아야 한다.
 * 2. 각 마을에서 마을까지의 이동비용이 주어질 때, 최소한의 이동비용으로 부모님을 모시고 섬의 모든 마을을 관광하려면 얼마의 이동비용을 준비해야하는가? 
 */
public class BAEK_14487 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// 마을의 수
		int[] moveCost = new int[n];
		
		String[] costs = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			moveCost[i] = Integer.parseInt(costs[i]);
		}
		
		// 오름차순 정렬
		Arrays.sort(moveCost);
		minMoveCost(moveCost);	
	}
	
	public static void minMoveCost(int[] moveCost) {
		int min = 0;
		for(int i=0; i<moveCost.length-1; i++) {
			min += moveCost[i];
		}
		System.out.println(min);
	}
}
