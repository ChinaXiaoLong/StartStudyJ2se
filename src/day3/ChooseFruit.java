package day3;

import java.util.Scanner;
public class ChooseFruit {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  
	  int a = 1;
	  Scanner scan = new Scanner(System.in);
	  int number = 12;
	String fru[] = {"ƻ��","�㽶","��","������","����","����","�ƹ�","����","����","����"};
	//��������Ԫ��
	int count = 0;
	for(String i:fru){
		count  ++; 
		System.out.print(count + i + "  ");
	}
	System.out.println();
	System.out.println("�밴���������ѡ���ˮ����");
	number = scan.nextInt();
	do{
		
		if(number > 0 && number < 11){
			switch(number){
			case 1:
				System.out.println("��ѡ���ˣ�" + fru[0]);
				break;
			case 2:
				System.out.println("��ѡ���ˣ�" + fru[1]);
				break;
			case 3:
				System.out.println("��ѡ���ˣ�" + fru[2]);
				break;
			case 4:
				System.out.println("��ѡ���ˣ�" + fru[3]);
				break;
			case 5:
				System.out.println("��ѡ���ˣ�" + fru[4]);
				break;
			case 6:
				System.out.println("��ѡ���ˣ�" + fru[5]);
				break;
			case 7:
				System.out.println("��ѡ���ˣ�" + fru[6]);
				break;
			case 8:
				System.out.println("��ѡ���ˣ�" + fru[7]);
				break;
			case 9:
				System.out.println("��ѡ���ˣ�" + fru[8]);
				break;
			case 10:
				System.out.println("��ѡ���ˣ�" + fru[9]);
				break;
			}
			break;
		}else{
			System.out.println("û�д˱�ŵ�ˮ��,���������룡");
			number = scan.nextInt();
		}		
	}while(a == 1 );
	
	
	
  }
}
