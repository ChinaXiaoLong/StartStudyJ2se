package day3;

import java.util.Scanner;

public class Cube {

	/**
	 附加题：
1、	编写程序，输出一个N行的魔方阵，魔方阵的要求如下：
a)	行数与列数相同且只能是奇数行的数字矩阵，例如3*3、5*5、7*7……
b)	魔方阵的特点为每行数字相加的和=每列数字相加的和=对角线数字相加的和
例如下图5*5的魔方阵：每行数字和、每列数字和、对角线数字和均为65
17	24	1	8	15
23	5	7	14	16
4	6	13	20	22
10	12	19	21	3
11	18	25	2	9
c)	计算魔方阵的算法为：数字1一定是第一行的中间位置，从2开始的每个数字均是上一个数字所在位置减一行多一列的位置，
如果找到的目标位置上已经被占用，则放置原来数的位置的下方。
	*/
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个奇数 N！");
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
