package day1;

import java.util.Scanner;

/*
 * �����⣺������ϵͳ
Ҫ��
1��	������������ʾ�û�����ע����Ϣ��Ҫ���û������û����������ȷ�����룬�ж��û����������Ƿ����Ҫ�������ȷ�������Ƿ���ͬ����������Ч����ע��ɹ���
������ʾ�û����е�¼�����������Ӧ�Ĵ�����ʾ��Ϣ�����������
2��	��ע��ɹ�����ɵ�¼���ܣ���ʾ�û������û��������룬��ո�ע�����Ϣ���бȽϣ���¼�ɹ��������Ӧ��ʾ��������������¹���
3��	��¼�ɹ�����ɸù��ܣ�ģ����ϵͳ�������û�һ����ʾ��Ϣ������Ҫ�������ǳ��棬���û�����1������������2�����棬��������������û�ѡ������ò͡����û�ѡ�񳴱��󣬼�����ʾ�û�ѡ�����㳴�����Ǽ�������
���������û���ѡ����ʾ��Ӧ����ʾ��Ϣ��������ѡ����****�����Ժ󣡡������û�ѡ���棬������ʾ�û�ѡ����˿���滹���߲����棬�������û���ѡ����ʾ��Ӧ����ʾ��Ϣ��������ѡ����****�����Ժ󣡡�

 */
public class Order {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("�������û�����ע���˺ţ�");
		System.out.println("�������˻���");
		String user1 = scan.next();
		System.out.println("���������룺");
		String password1 = scan.next();
		System.out.println("��ȷ�����룺");
		String password = scan.next();
		System.out.println("��ȷ������");
		if(password1.equals(password)){
			System.out.println("ע��ɹ���");
			System.out.println("-------------���½-------------");
			System.out.println("�û�����");
			String user2 = scan.next();
			System.out.println("���룺");
			String password2 = scan.next();
			if(user2.equals(user1) && password2.equals(password1)){
				System.out.println("��½�ɹ���");
				System.out.println("-------------------------------------------------");
				System.out.println("����Ҫ��1������   ��2������    �������������ò�");
				int a  = scan.nextInt();
    		    if(a == 1){
			    
			    	System.out.println("��ѡ�񳴱����ͣ���1�����㳴��    ��2����������");
			    	a = scan.nextInt();
		    	switch(a){
		    	case 1:
				    	  System.out.println("��ѡ�������㳴�����Ժ�");
				    	  break;
				      case 2:
				    	  System.out.println("��ѡ���˼����������Ժ�");
				    	  break;
				      default:
				    	  break;
			    	} 
			    	
			    }else if(a == 2){
			    	System.out.println("��ѡ���˳������Ժ�");
			    }else{
			    	System.out.println("����");
			    }
			}else{
              System.out.println("�û������������");   
			}
		}else{
			System.out.println("ע��ʧ�ܣ�");

		}
		
		
	}

}
