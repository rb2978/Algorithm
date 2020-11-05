package math;

import java.util.Scanner;

public class N1930_old {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int pn = 0;
		int[] v = new int[b];
		boolean[] check = new boolean[b+1];
		
		for(int i =2; i<=b;i++) {
			if(check[i]==false) {
			   
				v[pn] = i;
				pn =pn + 1;
			for(int j = i*2;j<=b;j+=i ) {
				check[j] = true;
			}
		    }
		}
		
		for(int z =0 ; z<b;z++) {
				if(v[z]>=a) {
				System.out.println(v[z]);
				}
			}
	}
}
