package day1;

import java.util.Scanner;

/*
 * 附加题：饭店点餐系统
要求：
1）	程序启动，提示用户进行注册信息，要求用户输入用户名、密码和确认密码，判断用户名和密码是否符合要求，密码和确认密码是否相同，若输入有效，则注册成功，
继续提示用户进行登录，否则给出相应的错误提示信息，程序结束。
2）	若注册成功，完成登录功能，提示用户输入用户名和密码，与刚刚注册的信息进行比较，登录成功则提出相应提示，并继续完成如下功能
3）	登录成功，完成该功能，模拟点餐系统。给出用户一个提示信息：您需要炒饼还是炒面，当用户输入1代表炒饼，输入2代表炒面，输入其他则代表用户选择放弃用餐。当用户选择炒饼后，继续提示用户选择鱿鱼炒饼还是鸡蛋炒饼
，并根据用户的选择，显示相应的提示信息，即“你选择了****，请稍后！”；当用户选择炒面，继续提示用户选择肉丝炒面还是蔬菜烧面，并根据用户的选择，显示相应的提示信息，即“你选择了****，请稍后！”

 */
public class Order {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("你是新用户，请注册账号！");
		System.out.println("请输入账户：");
		String user1 = scan.next();
		System.out.println("请输入密码：");
		String password1 = scan.next();
		System.out.println("请确认密码：");
		String password = scan.next();
		System.out.println("请确认密码");
		if(password1.equals(password)){
			System.out.println("注册成功！");
			System.out.println("-------------请登陆-------------");
			System.out.println("用户名：");
			String user2 = scan.next();
			System.out.println("密码：");
			String password2 = scan.next();
			if(user2.equals(user1) && password2.equals(password1)){
				System.out.println("登陆成功！");
				System.out.println("-------------------------------------------------");
				System.out.println("你需要【1】炒饼   【2】炒面    【其他】放弃用餐");
				int a  = scan.nextInt();
    		    if(a == 1){
			    
			    	System.out.println("请选择炒饼类型：【1】鱿鱼炒饼    【2】鸡蛋炒饼");
			    	a = scan.nextInt();
		    	switch(a){
		    	case 1:
				    	  System.out.println("你选择了鱿鱼炒饼请稍后！");
				    	  break;
				      case 2:
				    	  System.out.println("你选择了鸡蛋炒饼请稍后！");
				    	  break;
				      default:
				    	  break;
			    	} 
			    	
			    }else if(a == 2){
			    	System.out.println("你选择了炒面请稍后！");
			    }else{
			    	System.out.println("其他");
			    }
			}else{
              System.out.println("用户名或密码错误！");   
			}
		}else{
			System.out.println("注册失败！");

		}
		
		
	}

}
