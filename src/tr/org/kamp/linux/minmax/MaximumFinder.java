package tr.org.kamp.linux.minmax;
import java.util.Scanner;

public class MaximumFinder {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("İki sayi giriniz:");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		
		double result=minimum(num1,num2);
		System.out.println("Kucuk Sayi: "+result);
	}
	
	public static double minimum(double x,double y) {
		double minimumValue=x;
		if(y<minimumValue) {
			minimumValue=y;
		}
		return minimumValue;
		
	}
}
	
