package day4;

import java.util.Scanner;

public class Games {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int b;
		a = user();
		b = computer();
		compare(a ,b);
		
	}
	
	public static int user(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a;
		int b = 5 ;
	 do{
		 System.out.println("���ȭ����1��-ʯͷ��2��-������3��-��");
		 a = scan.nextInt();
		if(a > 0 && a < 4){
			if(a == 1){
				System.out.println("������ǣ�ʯͷ");
				a = 1;
				 b = 1;
			}else if(a == 2){
				System.out.println("������ǣ�����");
				a = 2;
				 b = 1;
			}else{
				System.out.println("������ǣ���");
				a = 3;
				 b = 1;
			}
			
	   }else{
			System.out.println("�����������������룺");
			 b = 5;
		   }
	 }while(b > 4);
	 return a;
	}
		
	
	public static int computer(){
		int b;
		b = (int)Math.round((Math.random()*2 + 1));
		if(b == 1){
			System.out.println("���Գ���ʯͷ��");
		}else if(b == 2){
			System.out.println("���Գ���������");
		}else{
			System.out.println("���Գ�������");
		}
		return  b;
	}
	
	
	public static void compare(int a ,int b){
		if(a == b){
			System.out.println("��ȭһ�£�ƽ�֣�");
		}else if(a == 1 && b == 2){
			System.out.println("ʯͷ vs ���������ʤ����");
		}else if ( a == 1 && b == 3){
			System.out.println("ʯͷ vs ��������ʤ����");
		}else if(a == 2 && b == 1){
			System.out.println("���� vs ʯͷ������ʤ����");
		}else if(a == 2 && b == 3){
			System.out.println("���� vs �������ʤ����");
		}else if(a == 3 && b == 1){
			System.out.println("�� vs ʯͷ�����ʤ����");
		}else if(a == 3 && b == 2){
			System.out.println("�� vs ����������ʤ����");
		}
		
	}

}
