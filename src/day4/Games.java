package day4;

import java.util.Scanner;

public class Games {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b;
		a = user();
		b = computer();
		compare(a ,b);
		
	}
	
	public static int user(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a;
		int b = 5 ;
	 do{
		 System.out.println("请出拳：【1】-石头【2】-剪刀【3】-布");
		 a = scan.nextInt();
		if(a > 0 && a < 4){
			if(a == 1){
				System.out.println("你出的是：石头");
				a = 1;
				 b = 1;
			}else if(a == 2){
				System.out.println("你出的是：剪刀");
				a = 2;
				 b = 1;
			}else{
				System.out.println("你出的是：布");
				a = 3;
				 b = 1;
			}
			
	   }else{
			System.out.println("输入有误请重新输入：");
			 b = 5;
		   }
	 }while(b > 4);
	 return a;
	}
		
	
	public static int computer(){
		int b;
		b = (int)Math.round((Math.random()*2 + 1));
		if(b == 1){
			System.out.println("电脑出：石头！");
		}else if(b == 2){
			System.out.println("电脑出：剪刀！");
		}else{
			System.out.println("电脑出：布！");
		}
		return  b;
	}
	
	
	public static void compare(int a ,int b){
		if(a == b){
			System.out.println("出拳一致：平局！");
		}else if(a == 1 && b == 2){
			System.out.println("石头 vs 剪刀：玩家胜出！");
		}else if ( a == 1 && b == 3){
			System.out.println("石头 vs 布：电脑胜出！");
		}else if(a == 2 && b == 1){
			System.out.println("剪刀 vs 石头：电脑胜出！");
		}else if(a == 2 && b == 3){
			System.out.println("剪刀 vs 布：玩家胜出！");
		}else if(a == 3 && b == 1){
			System.out.println("布 vs 石头：玩家胜出！");
		}else if(a == 3 && b == 2){
			System.out.println("布 vs 剪刀：电脑胜出！");
		}
		
	}

}
