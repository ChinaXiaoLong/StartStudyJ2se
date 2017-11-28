package day1;

import java.util.Scanner;

/**
2、	统计小朋友摘苹果的个数。具体要求如下：
a)	有小红、小刚、小丽、小玉4个小朋友到苹果园子摘苹果。
b)	先输入小红摘的苹果数，然后输出1个小朋友一共摘了多少个苹果；
c)	再输入小刚摘的苹果数，然后输出2个小朋友一共摘了多少个苹果；
d)	再输入小丽摘的苹果数，然后输出3个小朋友一共摘了多少个苹果；
e)	再输入小玉摘的苹果数，然后输出4个小朋友一共摘了多少个苹果。
 */

public class Sum {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入小红摘的苹果数：");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "个小朋友一共摘了" + sum + "个苹果！");
        System.out.println("----------------------------------------------------");
        System.out.println("请输入小刚摘的苹果数！");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "个小朋友一共摘了" + sum + "个苹果！");
        System.out.println("----------------------------------------------------");
        System.out.println("请输入小丽摘的苹果数！");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "个小朋友一共摘了" + sum + "个苹果！");
        System.out.println("--------------------------谢谢--------------------------");
        System.out.println("请输入小玉摘的苹果数！");
        sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "个小朋友一共摘了" + sum + "个苹果！");
        System.out.println("----------------------------------------------------");



	}

}
