package day1;

import java.util.Scanner;

/**
2��	ͳ��С����ժƻ���ĸ���������Ҫ�����£�
a)	��С�졢С�ա�С����С��4��С���ѵ�ƻ��԰��ժƻ����
b)	������С��ժ��ƻ������Ȼ�����1��С����һ��ժ�˶��ٸ�ƻ����
c)	������С��ժ��ƻ������Ȼ�����2��С����һ��ժ�˶��ٸ�ƻ����
d)	������С��ժ��ƻ������Ȼ�����3��С����һ��ժ�˶��ٸ�ƻ����
e)	������С��ժ��ƻ������Ȼ�����4��С����һ��ժ�˶��ٸ�ƻ����
 */

public class Sum {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������С��ժ��ƻ������");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "��С����һ��ժ��" + sum + "��ƻ����");
        System.out.println("----------------------------------------------------");
        System.out.println("������С��ժ��ƻ������");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "��С����һ��ժ��" + sum + "��ƻ����");
        System.out.println("----------------------------------------------------");
        System.out.println("������С��ժ��ƻ������");
		sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "��С����һ��ժ��" + sum + "��ƻ����");
        System.out.println("--------------------------лл--------------------------");
        System.out.println("������С��ժ��ƻ������");
        sum = sum + scan.nextInt();
		count = count + 1;
        System.out.println(count + "��С����һ��ժ��" + sum + "��ƻ����");
        System.out.println("----------------------------------------------------");



	}

}
