package day3;

import java.util.Scanner;

/*�����Ԫ��ȡֵ������
ģ��ѡ�೤��
	����5����ѡ��Ҫ��ѡ�೤��ÿ���˵ı�ŷֱ�Ϊ1��2��3��4��5�� ����������Ϊ��5����ѡ�˽���ͶƱ��
	ѭ������ÿ���˴Ӽ���������ͶƱ�ı�ţ���ͶƱ��Ч�������ͳ����Ӧ��ѡ�˵�Ʊ������ͶƱ��Ч������ʾͶƱ��Ч��
	������������һ��ͶƱ��ֱ�����ܵ�ͶƱΪ0��ʱ��ͶƱ��������ʾ��ÿλ��ѡ�˵ĵ�Ʊ��������ʾ��������λ��ѡ�˵�ѡ�˰೤
*/
public class Vote {
  public static void main(String[] args) {
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  int max = 0;
	  int a;
	int mo[] = new int[5]; 
	do{
	   System.out.println("��λ��λ��ѡ��ͶƱ����1��-Ͷ1��| ��2��-Ͷ2��|��3��-Ͷ3��|��4��-Ͷ4��|��5��-Ͷ5��");
	   a = scan.nextInt();
	   if(a > 0 && a < 6){
		   switch(a){
		   case 1:
			   mo[0] = mo[0] + 1;
			   System.out.println("���Ѿ�Ϊ1��ͶƱ");
			   break;
		   case 2:
			   mo[1] = mo[1] + 1;
			   System.out.println("���Ѿ�Ϊ2��ͶƱ");
			   break;
		   case 3:
			   mo[2] = mo[2] + 1;
			   System.out.println("���Ѿ�Ϊ3��ͶƱ");
			   break;
		   case 4:
			   mo[3] = mo[3] + 1;
			   System.out.println("���Ѿ�Ϊ4��ͶƱ");
			   break;
		   case 5:
			   mo[4] = mo[4] + 1;
			   System.out.println("���Ѿ�Ϊ5��ͶƱ");
			   break;
		   }
	   }else if(a != 0 && a > 5 ){
		   System.out.println("ͶƱ��Ч��");
	   }
		
	}while(a != 0);
	System.out.println("ͶƱ����---------------��");
	//�������� ��Ʊ��������
	for(int i = 0; i < 5;i ++){
		if(mo[i] > max){
			max = mo[i];
		}
		System.out.println( i + 1 +"�ţ�" + mo[i]);
	}
	//��Ʊ�������˵ı��
	for(int j = 0; j < 5; j ++){
		if(mo[j] == max){
			System.out.println((j + 1) + "�ŵ�ѡ�˰೤");
		}
		
	}

  }
}
