package algorithm.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 1. N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ�
// 2. ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� �־�����.
// 3. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
public class BAEK_2750 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		for(int i=0; i<N; i++) {
			String num = br.readLine();
			numArr[i] = Integer.parseInt(num);
		}
		
		// ��������
		Arrays.sort(numArr);
		
		for(int sortNum : numArr) {
			System.out.println(sortNum);
		}
	}
}
