package day1;

import java.util.Scanner;

/**
 * 
3、	拆数字
a)	从键盘输入一个五位数
b)	将这五位数拆分成5个一位数，分别保存在5个不同的变量中
c)	将拆分完的5个数，依次显示出来
例如：键盘输入42380，则输出4   2     3     8     0
 *
 */

public class SplitNumber {
    public static void main(String[] args) {
    	String merge = "";
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个五位数！");
		System.out.println("拆分前------");
		int a = scan.nextInt();
		merge = merge + a / 10000 + "  ";
		merge = merge + (a/1000)%10 + "  ";
		merge = merge + (a/100)%10 + "  ";
		merge = merge + (a/10)%10 + "  ";
		merge = merge + (a - (a/10)*10) + "  ";

		System.out.println("拆分后------");
		System.out.println(merge);
	}
}
