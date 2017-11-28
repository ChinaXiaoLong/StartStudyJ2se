package day4;

import java.util.Scanner;

public class BaseAndeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = scan.nextInt();
		if(n % 2 == 0){
			System.out.println("N为偶数：");
			System.out.println("2—n之间的偶数倒数和为：" + OddAdd(n));

		}else{
			System.out.println("N为奇数：");
			System.out.println("1—n之间的奇数的倒数和：" + evenAdd(n));

		}
	}
	
	public static double evenAdd(int n ){
		double sum = 0;
		for(int i = 1 ; i <= n ; i++){
			if(i % 2 != 0){
				sum = sum + 1.0/i;
			}
		}
		return  sum;
	}
	
	public static double OddAdd(int n){
		double sum = 0;
		for(int i = 2; i <= n ;i = i +2){
			sum = sum + 1.0/i;
		}	
		return sum;
	}
	

}
