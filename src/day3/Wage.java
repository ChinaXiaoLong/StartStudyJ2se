package day3;

import java.util.Scanner;

/*声明一个double类型的数组，用来存储员工的工资
2)	提示用户输入有多少个员工
3)	根据员工的个数，给数组分配长度
4)	接受用户从键盘输入每个员工的工资
5)	显示出所有员工的工资
6)	统计出所有员工的平均工资并输出
7)	求出最高工资和最低工资，并显示分别是哪个员工的工资*/

public class Wage {
  public static void main(String[] args) {
	  double avg = 0;
	  int a = 0;
	  double sum = 0;
	   int count = 0;
		System.out.println("你要输入的员工个数是：");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double wages[] = new double[count = scan.nextInt()];
		for(int i =1;i < wages.length + 1;i ++){
			System.out.println("请输入第" + i + "个员工工资！");
			wages[i -1] = scan.nextInt();
		}
		for(double i : wages){
			a ++;
			sum = sum + i;
			System.out.println("第 " + a +"个员工工资是：" + i);
		}
		System.out.println("------------------------------------------");
        avg = sum/count;
        System.out.println("所有有员工的平均工资是：" + avg);
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
        System.out.println("最低工资是：" + wages[0]);
        
        System.out.println("最高工资是：" + wages[wages.length - 1]);
  }
}

