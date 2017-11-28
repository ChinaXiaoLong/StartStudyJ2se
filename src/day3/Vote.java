package day3;

import java.util.Scanner;

/*数组的元素取值及运算
模拟选班长：
	现有5名候选人要竞选班长，每个人的编号分别为1、2、3、4、5。 现有若干人为这5个候选人进行投票。
	循环接受每个人从键盘输入所投票的编号，若投票有效，则进行统计相应候选人的票数，若投票无效，则提示投票无效，
	并继续接受下一个投票，直到接受的投票为0号时，投票结束。显示出每位候选人的得票数，并显示出最终哪位候选人当选了班长
*/
public class Vote {
  public static void main(String[] args) {
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  int max = 0;
	  int a;
	int mo[] = new int[5]; 
	do{
	   System.out.println("请位五位候选人投票：【1】-投1号| 【2】-投2号|【3】-投3号|【4】-投4号|【5】-投5号");
	   a = scan.nextInt();
	   if(a > 0 && a < 6){
		   switch(a){
		   case 1:
			   mo[0] = mo[0] + 1;
			   System.out.println("你已经为1号投票");
			   break;
		   case 2:
			   mo[1] = mo[1] + 1;
			   System.out.println("你已经为2号投票");
			   break;
		   case 3:
			   mo[2] = mo[2] + 1;
			   System.out.println("你已经为3号投票");
			   break;
		   case 4:
			   mo[3] = mo[3] + 1;
			   System.out.println("你已经为4号投票");
			   break;
		   case 5:
			   mo[4] = mo[4] + 1;
			   System.out.println("你已经为5号投票");
			   break;
		   }
	   }else if(a != 0 && a > 5 ){
		   System.out.println("投票无效！");
	   }
		
	}while(a != 0);
	System.out.println("投票结束---------------！");
	//遍历数组 找票数最多的人
	for(int i = 0; i < 5;i ++){
		if(mo[i] > max){
			max = mo[i];
		}
		System.out.println( i + 1 +"号：" + mo[i]);
	}
	//找票数最多的人的编号
	for(int j = 0; j < 5; j ++){
		if(mo[j] == max){
			System.out.println((j + 1) + "号当选了班长");
		}
		
	}

  }
}
