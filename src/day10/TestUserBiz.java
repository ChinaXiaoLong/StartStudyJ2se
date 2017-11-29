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
		//�û�ע��
		System.out.println("---------ע����Ϣ------------");
		int tab;
		do{
			tab = 0 ;
			System.out.print("�������û�����");
		    String userName = scan.next();
		    System.out.print("���������룺");
		    String userPassword = scan.next();
		    System.out.print("�ٴ����������룺");
		    String userPassword2 = scan.next();
		    System.out.print("��������ʵ����");
		    String name = scan.next();
		    System.out.print("���������䣺");
		    String userEmaile = scan.next();
			try {
				user.register(userName,userPassword,userPassword2, name,userEmaile);
			} catch (RegisterException e) {
				// TODO Auto-generated catch block
				tab = 1 ;
				e.printStackTrace();
				System.out.println("����ע�ᣡ");
			}
		}while(tab == 1);
		//�û���½
		System.out.println("---------��½��Ϣ------------");
		do{
	    tab = 0;
		System.out.println("�������˺ţ�");
		String username = scan.next();
		System.out.println("���������룡");
		String password = scan.next();
		try {
			user.login(username, password);
		} catch (LoginException e) {
			
			e.printStackTrace();
			System.out.println("�����µ�½��");
			tab = 1;
		}
		
		}while(tab == 1);
	}

}



