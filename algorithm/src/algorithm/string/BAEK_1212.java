package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_1212.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.13
 * @description		: 
 * 1. 8������ �־����� ��, 2������ ��ȯ�ϴ� ���α׷��� �ۼ�
 * 2. ù° �ٿ� 8������ �־�����. �־����� ���� ���̴� 333,334�� ���� �ʴ´�.
 * 3. ���� 2������ ��ȯ�Ͽ� ����Ѵ�. ���� 0�� ��츦 �����ϰ�� �ݵ�� 1�� ����
 */
public class BAEK_1212 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		convOctToBinary(num);
	}
	
	public static void convOctToBinary(String num) {
		
		String[] binaryStrArr = {"000", "001", "010", "011", "100", "101", "110", "111"};
		StringBuffer result = new StringBuffer();
		for(int i=0; i<num.length(); i++) {
			int number = num.charAt(i)-'0';
			if(i==0) {
				result.append(Integer.parseInt(binaryStrArr[number]));
			}else {
				result.append(binaryStrArr[number]);
			}
		}
		
		System.out.println(result.toString());
	}
}
