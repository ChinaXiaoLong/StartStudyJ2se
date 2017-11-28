package day2;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		double sum = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数N：");
		int n = scan.nextInt();
		if(n%2 == 0){
			System.out.println("该数是偶数：");
			int i = 2;
			while(i <= n){
			sum = sum + 1.0/i;
				i = i + 2;
			}
			System.out.println("2~" + n + "之间的偶数的倒数和是：" +sum);
		}else{
			int i = 1;
			while(i <= n){
			sum = sum + 1.0/i;
			i = i + 2;
			}
			System.out.println("1~" + n + "之间的奇数的倒数和是：" +sum);
			
		}
		
	}
}
