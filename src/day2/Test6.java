package day2;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("«Î ‰»ÎNµƒ÷µ£∫");
		int n = scan.nextInt();
		for(int i = 1;i <= n; i++){
			for(int j = 0;j <= n-i;j++){
				System.out.print(" ");
			}
			for(int j = 0;j < 2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = n-1;i >=1 ; i--){
			for(int j = n-i;j >=0 ;j--){
				System.out.print(" ");
			}
			for(int j = 2*i-1;j > 0;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
