package day1;

import java.util.Scanner;

/*
 * 、模拟商场购物打折的优惠活动
优惠活动细则如下：
1．消费金额不低于2000
1）如果是会员
A）现金支付：8折
B）信用卡支付：8.5折
C）借记卡支付：9折
2）如果不是会员：只能使用现金支付方式，可以享受9.5折优惠
2．消费金额低于2000：只能使用现金支付方式，不能享受任何打折的优惠

编写程序：接受用户从键盘输入消费金额，根据消费的具体金额、是否为会员和支付的方式输出该顾客实际需要支付的金额数。运行结果如下图所示（黑色字体为提示，红色字体为输入，蓝色字体为输出）：
****仔细观察下面的运行结果****
【运行结果第一种可能性】
请输入您的消费金额：1500
您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为1500元

【运行结果第二种可能性】
请输入您的消费金额：3000
请输入您是否为会员（y - 会员，其它 - 非会员）：1
请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）：1
您消费3000元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为2400元

【运行结果第三种可能性】
请输入您的消费金额：5000
请输入您是否为会员（y - 会员，其它 - 非会员）：1
请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）：3
您消费5000元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为4500元

【运行结果的第四种可能性】
请输入您的消费金额：2500
请输入您是否为会员（y - 会员，其它 - 非会员）：0
您消费2500元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为2375元
 */

public class Shopp {
	  public static void main(String[] args) {
		  double money = 0;
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
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
	}

}
