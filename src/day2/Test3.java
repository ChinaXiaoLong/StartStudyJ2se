package day2;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
	  int sum = 0;
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("����1~n��n��ֵ��");
	int n = scan.nextInt();
	for(int i = 1; i< n + 1;i++){
		if((i % 2) == 0){
			sum = sum + i*i;
		}
		
	}
	System.out.println("1~" + n +" ֮���ż��ƽ�����ǣ�"+ sum);
  }
}
