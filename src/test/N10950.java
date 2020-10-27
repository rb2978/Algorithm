package test;

import java.util.*;

public class N10950 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a, b, i;
		
		n = sc.nextInt();
		for (i = 1; i <=n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			System.out.println("Case #"+i+": "+(a+b));
		}
	}
}
