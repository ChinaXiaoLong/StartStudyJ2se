package day2;

import java.util.Scanner;

public class ChiceGames {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	System.out.println("������Ϸ���£�");
	System.out.println("1��WOW");
	System.out.println("2������");
	System.out.println("3���λ�����");
	System.out.println("4������֮��");
	System.out.println("5��������ol");
	System.out.println("��������ѡ�����Ϸ��");
	int a = scan.nextInt();
	while(a > 0){
		if(a == 1){
			System.out.println("��ѡ����*WOW*");
			break;
		}else if(a == 2){
			System.out.println("��ѡ����*����*");
			break;
		}else if(a == 3){
			System.out.println("��ѡ����*�λ�����*");
			break;

		}else if(a == 4){
			System.out.println("��ѡ����*����֮��*");
			break;

		}else if(a == 5){
			System.out.println("��ѡ����*������ol*");
			break;
		}else{
			System.out.println(">>>>>���������Ϸ�����Ч����������룡��");
			a = scan.nextInt();
		}
	}
	System.out.println("�����������浽�ĵȼ���");
	int b = scan.nextInt();
	if(b < 21 ){
		System.out.println("�������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	}else if(b > 20 && b < 41){
		System.out.println("���Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	}else if(b > 40 && b < 61){
		System.out.println("���Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	}else if(b > 60){
		System.out.println("���Ѿ������޵��ˣ�̫ţ�ˣ���");
	}
  }
}
   
