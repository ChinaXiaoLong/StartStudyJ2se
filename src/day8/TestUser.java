package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TestUser {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	List<User> list = new ArrayList<User>();
	User user1 = new User();
	User user2 = new User();
	User user3 = new User();
	User user4 = new User();
	User user5 = new User();
	//���û����뼯��list��
	list.add(user1);
	list.add(user2);
	list.add(user3);
	list.add(user4);
	list.add(user5);
	//��ֵ
	for(int i = 0; i < 5; i ++){
		System.out.println("�������û�����");
		list.get(i).name = scan.next();
		System.out.println("���������룺��");
		list.get(i).pass = scan.next();
		System.out.println("���ڳ��У�");
		list.get(i).city = scan.next();
	}
	//��������
	for(User user : list){	
		System.out.println("==========================");
		user.show();
	}

	
}
}

class User{
	String name ;
	String pass ;
	String city ;
	public void show(){
		System.out.println("�û�����" + this.name + "\n���룺" + this.pass + "\n���У�" + this.city);
	}
}