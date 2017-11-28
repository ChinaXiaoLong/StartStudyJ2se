package day3;

import java.util.Scanner;
public class ChooseFruit {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  
	  int a = 1;
	  Scanner scan = new Scanner(System.in);
	  int number = 12;
	String fru[] = {"苹果","香蕉","梨","火龙果","李子","西瓜","黄瓜","葡萄","杏子","桃子"};
	//遍历数组元素
	int count = 0;
	for(String i:fru){
		count  ++; 
		System.out.print(count + i + "  ");
	}
	System.out.println();
	System.out.println("请按编号输入你选择的水果：");
	number = scan.nextInt();
	do{
		
		if(number > 0 && number < 11){
			switch(number){
			case 1:
				System.out.println("你选择了：" + fru[0]);
				break;
			case 2:
				System.out.println("你选择了：" + fru[1]);
				break;
			case 3:
				System.out.println("你选择了：" + fru[2]);
				break;
			case 4:
				System.out.println("你选择了：" + fru[3]);
				break;
			case 5:
				System.out.println("你选择了：" + fru[4]);
				break;
			case 6:
				System.out.println("你选择了：" + fru[5]);
				break;
			case 7:
				System.out.println("你选择了：" + fru[6]);
				break;
			case 8:
				System.out.println("你选择了：" + fru[7]);
				break;
			case 9:
				System.out.println("你选择了：" + fru[8]);
				break;
			case 10:
				System.out.println("你选择了：" + fru[9]);
				break;
			}
			break;
		}else{
			System.out.println("没有此编号的水果,请重新输入！");
			number = scan.nextInt();
		}		
	}while(a == 1 );
	
	
	
  }
}
