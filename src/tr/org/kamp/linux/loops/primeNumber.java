
package tr.org.kamp.linux.loops;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("bir sayı giriniz : ");
		int number = input.nextInt();
		boolean flag=true;//bayrak
		boolean isPrime=true;//asal
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(number+"The number isprime");
		}
		else {
			System.out.println(number+"The number is not isPrime");
		}
	}
}
	
		
		
		
		