package day2;

import java.util.Scanner;

public class DoWhileShop {
	  public static void main(String[] args) {
		  String isGo = "";
		  double money = 0;
		  @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		  do{
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
			  System.out.println("�Ƿ�Ϊ��һ���˿ͽ��ˡ�y���������������˳�");
			  isGo = scan.next();
		  }while("y".equalsIgnoreCase(isGo));
	}

}
