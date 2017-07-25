package tr.org.kamp.linux.calculator;

import java.util.Scanner;

public class primativeCalculator {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	boolean ctn=true;
	while(ctn) {
		System.out.println("Bir sayi giriniz:");
		double number1=input.nextDouble();
		System.out.println("İslem Seciniz");
		String inputFonction=input.next();
		double result=0;
		double number2=0;
		
		switch(inputFonction) {
		case "+":
			System.out.println("Bir sayi daha giriniz:");
			number2=input.nextDouble();
			result=number1+number2;
		case "-":
			System.out.println("Bir sayi dahagiriniz:");
			number2=input.nextDouble();
			result=number1-number2;
		case "*":
			System.out.println("Bir Sayi daha Giriniz:");
			number2=input.nextDouble();
			result=number1*number2;
			default:
				System.out.println("Lütfen +/-/* birini seciniz:");
			
			
		}
	}
	
}
}
















