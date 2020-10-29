package stack;

import java.util.*;

public class N9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		while(T-->0){
			String str = sc.next();
			String v = "";
			int z = str.length();
			int cnt = 0;
			
			for(int i =0 ; i < z ; i++) {
				if(cnt==0 && str.charAt(i)==')') {
					v = "NO";
					break;
				}
				if(str.charAt(i)=='(') {
					cnt+=1;
				}else if(str.charAt(i)==')') {
					cnt-=1;			
				}
				
			}
			if (cnt == 0 && v != "NO") {
				v = "YES";
				System.out.println(v);
			}else if (v == "NO") {
				v = "NO";
				System.out.println(v);
			}
			else {
				v = "NO";
				System.out.println(v);
			}
			
		}
		
	}

}
