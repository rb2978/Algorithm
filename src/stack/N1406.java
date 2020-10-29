package stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class N1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> L = new Stack<>();
		Stack<Character> R = new Stack<>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 String str = bf.readLine();
		 char xz = 0;
		
		 for(char c : str.toCharArray()) {
			 L.push(c);
		 }
		 int c = Integer.parseInt(bf.readLine());
			
		for(int i = 0 ; i<c ; i++) {
			String a = bf.readLine();
			 if (a.equals("L")){
				 if(!L.empty()) {
					 R.push(L.pop());
				 }
			 }else if (a.equals("D")) {
				 if(!R.empty()) {
					 L.push(R.pop());
				 }
			 }else if (a.equals("B")) {
				 if(!L.empty()) {
					 L.pop();
				 }
			 }else if (a.contains("P")) {
				 xz = a.charAt(a.length() - 1);
				 L.push(xz);
			 }
		 }
		 while(!L.empty()) {
			 R.push(L.pop());
		 }
		 while(!R.empty()) {
			 bw.append(R.pop());
		 }bw.flush();
	}
}
