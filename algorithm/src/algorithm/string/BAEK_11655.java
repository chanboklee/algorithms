package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @packageName		: algorithm.string
 * @fileName		: BAEK_11655.java
 * @author			: Lee ChanBok
 * @date			: 2021.11.16
 * @description		:
 * 1. ROT13�� ī�̻縣 ��ȣ�� �������� ���� ���ĺ��� 13���ھ� �о �����.
 * 2. ù° �ٿ� ���ĺ� �빮��, �ҹ���, ����, ���ڷθ� �̷���� ���ڿ� S�� �־�����. S�� ���̴� 100�� ���� �ʴ´�.
 * 3. ù° �ٿ� S�� ROT13���� ��ȣȭ�� ������ ��� 
 */
public class BAEK_11655 {
	public static void main(String[] args) throws IOException{		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		String rot13 = encryptionToRot13(S);
		System.out.println(rot13);

	}
	
	public static String encryptionToRot13(String S) {
		
		StringBuffer result = new StringBuffer();
		for(int i=0; i<S.length(); i++) {
			int chInt = S.charAt(i);
			if(chInt >= 97 && chInt <= 122) {
				if(chInt > 109) {
					result.append((char)(chInt - 13));
				}else {
					result.append((char)(chInt + 13));
				}
			}else if(chInt >= 65 && chInt <= 90) {
				if(chInt > 77) {
					result.append((char)(chInt - 13));
				}else {
					result.append((char)(chInt + 13));
				}
			}else {
				result.append(S.charAt(i));
			}
		}
		
		return result.toString();
	}
}
