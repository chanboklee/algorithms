package algorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEK_1259 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer result = new StringBuffer();
		while(true) {
			String palindrome = br.readLine();
			if(palindrome.equals("0")) {
				break;
			}
			
			String chkPalindrome = checkPalindrome(palindrome);
			result.append(chkPalindrome).append("\n");
		}
		
		System.out.println(result.toString());
		
	}
	
	public static String checkPalindrome(String palindrome) {
		
		boolean flag = true;
		for(int i=0; i<palindrome.length()/2; i++) {
			if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)) {
				flag = false;
				break;
			}
		}
		
		return flag ? "yes" : "no";
	}
}
