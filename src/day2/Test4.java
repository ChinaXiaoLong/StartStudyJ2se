package day2;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		double sum = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����N��");
		int n = scan.nextInt();
		if(n%2 == 0){
			System.out.println("������ż����");
			int i = 2;
			while(i <= n){
			sum = sum + 1.0/i;
				i = i + 2;
			}
			System.out.println("2~" + n + "֮���ż���ĵ������ǣ�" +sum);
		}else{
			int i = 1;
			while(i <= n){
			sum = sum + 1.0/i;
			i = i + 2;
			}
			System.out.println("1~" + n + "֮��������ĵ������ǣ�" +sum);
			
		}
		
	}
}
