import java.util.*;

import jdk.nashorn.internal.parser.Scanner;
public class armstrong {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t=n;
		int s=0;
		int digits=(int)(log10(t)+1);
		while(t!=0){
			int rem=t%10;
			s=s+Math.pow(rem, digits);
			t=t/10;
		}
		if(s==n){
		return true;
        }
		
		return false;
	}
}
