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
 * 1. ������ A�������� ������ B������ ���� ���ؼ��� ���� �Ǵ� ������ ���θ� ���� �ؾȰ��� ���� ���� ���ƾ� �Ѵ�.
 * 2. �� �������� ���������� �̵������ �־��� ��, �ּ����� �̵�������� �θ���� ��ð� ���� ��� ������ �����Ϸ��� ���� �̵������ �غ��ؾ��ϴ°�? 
 */
public class BAEK_14487 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// ������ ��
		int[] moveCost = new int[n];
		
		String[] costs = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			moveCost[i] = Integer.parseInt(costs[i]);
		}
		
		// �������� ����
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
