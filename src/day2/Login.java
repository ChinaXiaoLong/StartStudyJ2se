package day2;

import java.util.Scanner;

public class Login {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	for(int i = 0;i < 3;i++){
		System.out.println("请输入用户名：");
		String user = scan.next();
		System.out.println("请输入密码：");
		String password = scan.next();
		if("admin".equals(user) && "asjy".equals(password)){
			System.out.println("登陆成功！");
			break;
		}else{
			if(i <2){
			System.out.println("输入错误!请重新输入！");
			}else{
			System.out.println("输入错误达到三次！退出！");
			}
		}
	}
   }
}
