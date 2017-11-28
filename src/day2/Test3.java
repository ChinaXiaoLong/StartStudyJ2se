package day2;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
	  int sum = 0;
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("输入1~n中n的值：");
	int n = scan.nextInt();
	for(int i = 1; i< n + 1;i++){
		if((i % 2) == 0){
			sum = sum + i*i;
		}
		
	}
	System.out.println("1~" + n +" 之间的偶数平方和是："+ sum);
  }
}
