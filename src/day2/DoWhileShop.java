package day2;

import java.util.Scanner;

public class DoWhileShop {
	  public static void main(String[] args) {
		  String isGo = "";
		  double money = 0;
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		  do{
		  System.out.println("请输入消费金额！");
		  money = scan.nextDouble();
			  if( money > 2000){
				  System.out.println("请输入你是否是会员（【y】 - 是，【其他】-不是）");
				  String b = scan.next();
				  if("y".equals(b)){
					  System.out.println("请选择支付方式（）【1】-现金支付，【2】-信用卡支付，【其他】-借记卡支付");
					  int c = scan.nextInt();
					  if( c == 1){
						  System.out.println("您消费"+ money +"元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为" +(money*0.8) +"元");
					  }else if(c == 2){
						  System.out.println("您消费"+ money +"元，并且为会员，选择了现金支付，可以享受8.5信用卡支付，您的实际支付金额为" + (money*0.85) +"元");
					  }else{
						  System.out.println("您消费"+ money +"元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为" +(money*0.9) +"元");

					  }
				  }else{
					  System.out.println("您消费"+ money +"元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为"+ (money*0.95)+"元");
				  }
			  }else{
				  System.out.println("您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为" + money +"元");
			  }
			  System.out.println("是否为下一个顾客结账【y】继续【其他】退出");
			  isGo = scan.next();
		  }while("y".equalsIgnoreCase(isGo));
	}

}
