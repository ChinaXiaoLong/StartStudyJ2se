package day4;

import java.util.Scanner;

public class BaseAndeven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		int n = scan.nextInt();
		if(n % 2 == 0){
			System.out.println("NΪż����");
			System.out.println("2��n֮���ż��������Ϊ��" + OddAdd(n));

		}else{
			System.out.println("NΪ������");
			System.out.println("1��n֮��������ĵ����ͣ�" + evenAdd(n));

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
