package day6;

import java.util.Scanner;

public class TestPerson {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������������䡢�Ա������׶�԰��");
		Child c = new Child(scan.next(), scan.nextInt(), scan.next() ,scan.next());
		c.show();
		System.out.println("����������ʲô��Ϸ��");
		c.game(scan.next());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("����ѧ�������������䡢�Ա𡢰༶");
		Student stu = new Student(scan.next() , scan.nextInt() , scan.next() , scan.nextInt());
		stu.show();
		System.out.println("������ѧ��Ŀ��");
		stu.study(scan.next());
		
	}

}
