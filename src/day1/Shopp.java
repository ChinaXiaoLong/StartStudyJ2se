package day1;

import java.util.Scanner;

/*
 * ��ģ���̳�������۵��Żݻ
�Żݻϸ�����£�
1�����ѽ�����2000
1������ǻ�Ա
A���ֽ�֧����8��
B�����ÿ�֧����8.5��
C����ǿ�֧����9��
2��������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Ż�
2�����ѽ�����2000��ֻ��ʹ���ֽ�֧����ʽ�����������κδ��۵��Ż�

��д���򣺽����û��Ӽ����������ѽ��������ѵľ�����Ƿ�Ϊ��Ա��֧���ķ�ʽ����ù˿�ʵ����Ҫ֧���Ľ���������н������ͼ��ʾ����ɫ����Ϊ��ʾ����ɫ����Ϊ���룬��ɫ����Ϊ�������
****��ϸ�۲���������н��****
�����н����һ�ֿ����ԡ�
�������������ѽ�1500
�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ1500Ԫ

�����н���ڶ��ֿ����ԡ�
�������������ѽ�3000
���������Ƿ�Ϊ��Ա��y - ��Ա������ - �ǻ�Ա����1
����������֧����ʽ��1-�ֽ�֧�� 2-���ÿ�֧�� ����-��ǿ�֧������1
������3000Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ2400Ԫ

�����н�������ֿ����ԡ�
�������������ѽ�5000
���������Ƿ�Ϊ��Ա��y - ��Ա������ - �ǻ�Ա����1
����������֧����ʽ��1-�ֽ�֧�� 2-���ÿ�֧�� ����-��ǿ�֧������3
������5000Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ4500Ԫ

�����н���ĵ����ֿ����ԡ�
�������������ѽ�2500
���������Ƿ�Ϊ��Ա��y - ��Ա������ - �ǻ�Ա����0
������2500Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ2375Ԫ
 */

public class Shopp {
	  public static void main(String[] args) {
		  double money = 0;
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		  System.out.println("���������ѽ�");
		  money = scan.nextDouble();
			  if( money > 2000){
				  System.out.println("���������Ƿ��ǻ�Ա����y�� - �ǣ���������-���ǣ�");
				  String b = scan.next();
				  if("y".equals(b)){
					  System.out.println("��ѡ��֧����ʽ������1��-�ֽ�֧������2��-���ÿ�֧������������-��ǿ�֧��");
					  int c = scan.nextInt();
					  if( c == 1){
						  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ" +(money*0.8) +"Ԫ");
					  }else if(c == 2){
						  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8.5���ÿ�֧��������ʵ��֧�����Ϊ" + (money*0.85) +"Ԫ");
					  }else{
						  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ" +(money*0.9) +"Ԫ");

					  }
				  }else{
					  System.out.println("������"+ money +"Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ"+ (money*0.95)+"Ԫ");
				  }
			  }else{
				  System.out.println("�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ" + money +"Ԫ");
			  }
	}

}