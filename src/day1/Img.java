package day1;

import java.util.Scanner;

/**
1��	��ͼ�ε��ܳ������������Ҫ�����£�
a)	ͨ���������볤���εĳ��Ϳ�����ǰ������Ӧ����ʾ����������ε��ܳ�����������
b)	ͨ���������������εı߳�������ǰ������Ӧ����ʾ����������ε��ܳ�����������
c)	ͨ����������Բ�εİ뾶������ǰ������Ӧ����ʾ�����Բ�ε��ܳ�����������
d)	ͨ���������������εı߳�������ǰ������Ӧ����ʾ����������ε��ܳ�����������
d = (a+b+c)/2; ��� = Math.sqrt(d*(d-a)*(d-b)*(d-c))
 */

public class Img {
  public static void main(String[] args) {
	  double a = 0;
	  double b = 0;
	  double c = 0;
	  double area = 0;
	  double perimeter = 0;
	  double weigh = 0;
	  double heigh = 0;
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  System.out.println("�����볤���εĿ�͸ߣ�");
	  weigh = scan.nextDouble();
	  heigh = scan.nextDouble();
	  perimeter = (heigh + weigh) * 2.0;
	  area =  heigh *  weigh;
	  System.out.println("�����ε��ܳ��ǣ�" + perimeter + "  �����ε�����ǣ�" + area);
	  System.out.println("------------------------------------------------------------------");
	  System.out.println("�����������εı߳���");
	  heigh = scan.nextDouble();
	  perimeter = heigh * 4;
	  area = heigh * heigh;
	  System.out.println("�����ε��ܳ��ǣ�" + perimeter + "  �����ε�����ǣ�" + area);
	  System.out.println("------------------------------------------------------------------");
	  System.out.println("������Բ�İ뾶��");
	  heigh = scan.nextDouble();
	  perimeter = 2*Math.PI*heigh;
	  area = Math.PI*heigh*heigh;
	  System.out.println("Բ���ܳ��ǣ�" + perimeter + "  Բ������ǣ�" + area);
	  System.out.println("------------------------------------------------------------------");
      System.out.println("�����������ε����߳���");
      a = scan.nextDouble();
	  b = scan.nextDouble();
	  c = scan.nextDouble();
	  if(a < b + c && b < a + c && c < a + b){
		  perimeter = (a+b+c)/2.0;
		  area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
		  System.out.println("�����ε��ܳ��ǣ�" + perimeter + "  �����ε�����ǣ�" + area);
	  }else{
		  System.out.println("���ܹ��������Σ�");
	  }
	  System.out.println("------------------------------------------------------------------");
	
  }
}
