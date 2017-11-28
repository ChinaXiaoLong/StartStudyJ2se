package day2;

import java.util.Scanner;

public class ChiceGames {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("现有游戏如下：");
	System.out.println("1、WOW");
	System.out.println("2、传奇");
	System.out.println("3、梦幻西游");
	System.out.println("4、永恒之塔");
	System.out.println("5、七龙珠ol");
	System.out.println("请输入您选择的游戏：");
	int a = scan.nextInt();
	while(a > 0){
		if(a == 1){
			System.out.println("您选择了*WOW*");
			break;
		}else if(a == 2){
			System.out.println("您选择了*传奇*");
			break;
		}else if(a == 3){
			System.out.println("您选择了*梦幻西游*");
			break;

		}else if(a == 4){
			System.out.println("您选择了*永恒之塔*");
			break;

		}else if(a == 5){
			System.out.println("您选择了*七龙珠ol*");
			break;
		}else{
			System.out.println(">>>>>您输入的游戏编号无效，请继续输入！！");
			a = scan.nextInt();
		}
	}
	System.out.println("请输入你已玩到的等级：");
	int b = scan.nextInt();
	if(b < 21 ){
		System.out.println("您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	}else if(b > 20 && b < 41){
		System.out.println("您已经开始行走江湖，算是小有成就了，加油！！");
	}else if(b > 40 && b < 61){
		System.out.println("您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	}else if(b > 60){
		System.out.println("您已经天下无敌了，太牛了！！");
	}
  }
}
   
