package day3;

import java.util.Scanner;

public class Cube {

	/**
	 �����⣺
1��	��д�������һ��N�е�ħ����ħ�����Ҫ�����£�
a)	������������ͬ��ֻ���������е����־�������3*3��5*5��7*7����
b)	ħ������ص�Ϊÿ��������ӵĺ�=ÿ��������ӵĺ�=�Խ���������ӵĺ�
������ͼ5*5��ħ����ÿ�����ֺ͡�ÿ�����ֺ͡��Խ������ֺ;�Ϊ65
17	24	1	8	15
23	5	7	14	16
4	6	13	20	22
10	12	19	21	3
11	18	25	2	9
c)	����ħ������㷨Ϊ������1һ���ǵ�һ�е��м�λ�ã���2��ʼ��ÿ�����־�����һ����������λ�ü�һ�ж�һ�е�λ�ã�
����ҵ���Ŀ��λ�����Ѿ���ռ�ã������ԭ������λ�õ��·���
	*/
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������ N��");
		int n = scan.nextInt();
		int[][] cube = new int[n][n];
		cube[0][n/2] = 1;
        @SuppressWarnings("unused")
		int span;
		@SuppressWarnings("unused")
		int col;
		for(int i = 2 ; i < n * n ; i ++){
					
		}
		
		
		for(int i = 0 ;i < 5 ; i ++){
			for(int j = 0 ;j < 5 ;j ++){
				System.out.print(cube[i][j] + "   ");
			}
			System.out.println();
		}
		
		

	}

}
