package tr.org.kamp.linux.fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("İlk kaç sayının fibonaccisini istiyorsun?");
		
		int count = input.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(n1);
		System.out.println(n2);
		for(int i=2; i < count; i++) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}