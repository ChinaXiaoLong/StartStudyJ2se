package day3;

import java.util.Scanner;

public class ArrayShop {
   public static void main(String[] args) {
	  double max = 0;//����������ѽ��
	  double min;//����������Ѷ�
	  int i = 0; //������������ֵ�ı���	   
	  double sum = 0;//ͳ��������
	  String isGo = "";
	  double money = 0;
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  //����һ�����ÿ�ν���ʵ��֧����������
	  double m[] = new double[20];
	  
	  
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
					 sum = sum + (money*0.8);
					 m[i] = (money*0.8);
					 i ++;
					  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ" + (money*0.8) +"Ԫ");
				  }else if(c == 2){
					  sum = sum + (money*0.85);
					  m[i] = (money*0.85);
						 i ++;
					  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8.5���ÿ�֧��������ʵ��֧�����Ϊ" + (money*0.85) +"Ԫ");
				  }else{
					  sum = sum + (money*0.9);
					  m[i] = (money*0.9);
						 i ++;
					  System.out.println("������"+ money +"Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ" +(money*0.9) +"Ԫ");

				  }
			  }else{
				  sum = sum +  (money*0.95);
				  m[i] = (money*0.95);
					 i ++;
				  System.out.println("������"+ money +"Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ"+ (money*0.95)+"Ԫ");
			  }
		  }else{
			  sum = sum +   money;
			  m[i] = money;
				 i ++;
			  System.out.println("�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ" + money +"Ԫ");
		  }
		  System.out.println("�Ƿ�Ϊ��һ���˿ͽ��ˡ�y���������������˳�");
		  isGo = scan.next();
	  }while("y".equalsIgnoreCase(isGo));
	  
	  System.out.println("-------------------------------------------------------------");
	  System.out.println("���챾�̳����������ǣ�"+ sum);
	  min = m[0];
	for(int j = 0;j < i; j++){
		 if(max < m[j]){
			max = m[j];
		 }
		 if(min > m[j]){
			 min = m[j];
		 }
	 }
	 System.out.println("-------------------------------------------------------------"); 
	  System.out.println("������������ܶ" + max);
	  System.out.println("������������ܶ" + min);
   }
 }
