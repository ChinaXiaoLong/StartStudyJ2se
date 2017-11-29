package day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestUserBiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Map<String,User> map = new HashMap<String,User>();
		UserBize user = new UserBize(map);
		//用户注册
		System.out.println("---------注册信息------------");
		int tab;
		do{
			tab = 0 ;
			System.out.print("请输入用户名：");
		    String userName = scan.next();
		    System.out.print("请输入密码：");
		    String userPassword = scan.next();
		    System.out.print("再次请输入密码：");
		    String userPassword2 = scan.next();
		    System.out.print("请输入真实名：");
		    String name = scan.next();
		    System.out.print("请输入邮箱：");
		    String userEmaile = scan.next();
			try {
				user.register(userName,userPassword,userPassword2, name,userEmaile);
			} catch (RegisterException e) {
				// TODO Auto-generated catch block
				tab = 1 ;
				e.printStackTrace();
				System.out.println("重新注册！");
			}
		}while(tab == 1);
		//用户登陆
		System.out.println("---------登陆信息------------");
		do{
	    tab = 0;
		System.out.println("请输入账号！");
		String username = scan.next();
		System.out.println("请输入密码！");
		String password = scan.next();
		try {
			user.login(username, password);
		} catch (LoginException e) {
			
			e.printStackTrace();
			System.out.println("请重新登陆！");
			tab = 1;
		}
		
		}while(tab == 1);
	}

}



