package algorithm.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
// 2. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
// 3. ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ���
public class BAEK_2839 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		totalSugarBag(N);
	}
	
	public static void totalSugarBag(int N) {
		
		int cnt = 0;
		while(true) {
			if(N % 5 == 0) {
				System.out.println(N/5 + cnt);
				break;
			}else if(N < 0) {
				System.out.println("-1");
				break;
			}
			
			N = N-3;
			cnt++;
		}
	}
}
