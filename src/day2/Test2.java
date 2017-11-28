package day2;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入一个整数：");
    int sum = scan.nextInt();
	int result = 0;
	int sumcopy = sum;
	while(sumcopy != 0){
		int mult = 1;
		while(sum != 0){
			result = sum % 10 ;		
			sum = (sum - result)/10;
			mult = mult * 10;
		}
	    sumcopy = sumcopy - result * mult/10;
	    sum = sumcopy;
		System.out.print(result + " ");
	}
  }
}
