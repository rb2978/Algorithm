package math;

import java.util.Scanner;

public class N1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		boolean[] check = new boolean[b+1];
		check[0] = check[1] = true;
		for(int i =2; i*i<=b;i++) {
			if(check[i]==true) {
			continue;
			}	

			for(int j = i*i;j<=b;j+=i ) {
				check[j] = true;
			}
		    
		}
		
		for(int z =a ; z<=b;z++) {
			if (check[z]==false) {
				System.out.println(z);	
			}
			
			}
	}
}
