package day3;

import java.util.Scanner;

/*����һ��double���͵����飬�����洢Ա���Ĺ���
2)	��ʾ�û������ж��ٸ�Ա��
3)	����Ա���ĸ�������������䳤��
4)	�����û��Ӽ�������ÿ��Ա���Ĺ���
5)	��ʾ������Ա���Ĺ���
6)	ͳ�Ƴ�����Ա����ƽ�����ʲ����
7)	�����߹��ʺ���͹��ʣ�����ʾ�ֱ����ĸ�Ա���Ĺ���*/

public class Wage {
  public static void main(String[] args) {
	  double avg = 0;
	  int a = 0;
	  double sum = 0;
	   int count = 0;
		System.out.println("��Ҫ�����Ա�������ǣ�");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double wages[] = new double[count = scan.nextInt()];
		for(int i =1;i < wages.length + 1;i ++){
			System.out.println("�������" + i + "��Ա�����ʣ�");
			wages[i -1] = scan.nextInt();
		}
		for(double i : wages){
			a ++;
			sum = sum + i;
			System.out.println("�� " + a +"��Ա�������ǣ�" + i);
		}
		System.out.println("------------------------------------------");
        avg = sum/count;
        System.out.println("������Ա����ƽ�������ǣ�" + avg);
        System.out.println("------------------------------------------");        
        for(int i = 1;i < wages.length;i ++){
        	for(int j = 0;j < wages.length - 1; j++){
        		if(wages[j] > wages[j+1]){
        		double temp = wages[j] ;
        		wages[j] = wages[j + 1];
        		wages[j + 1] = temp;
        		}
        	}
        }
        System.out.println("��͹����ǣ�" + wages[0]);
        
        System.out.println("��߹����ǣ�" + wages[wages.length - 1]);
  }
}

