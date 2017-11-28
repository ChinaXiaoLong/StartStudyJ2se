package day6;

import java.util.Scanner;

public class TestPerson {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入姓名、年龄、性别、所在幼儿园：");
		Child c = new Child(scan.next(), scan.nextInt(), scan.next() ,scan.next());
		c.show();
		System.out.println("输入正在做什么游戏！");
		c.game(scan.next());
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("输入学生的姓名、年龄、性别、班级");
		Student stu = new Student(scan.next() , scan.nextInt() , scan.next() , scan.nextInt());
		stu.show();
		System.out.println("输入所学科目：");
		stu.study(scan.next());
		
	}

}
