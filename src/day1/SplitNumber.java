package day1;

import java.util.Scanner;

/**
 * 
3��	������
a)	�Ӽ�������һ����λ��
b)	������λ����ֳ�5��һλ�����ֱ𱣴���5����ͬ�ı�����
c)	��������5������������ʾ����
���磺��������42380�������4   2     3     8     0
 *
 */

public class SplitNumber {
    public static void main(String[] args) {
    	String merge = "";
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ����λ����");
		System.out.println("���ǰ------");
		int a = scan.nextInt();
		merge = merge + a / 10000 + "  ";
		merge = merge + (a/1000)%10 + "  ";
		merge = merge + (a/100)%10 + "  ";
		merge = merge + (a/10)%10 + "  ";
		merge = merge + (a - (a/10)*10) + "  ";

		System.out.println("��ֺ�------");
		System.out.println(merge);
	}
}
