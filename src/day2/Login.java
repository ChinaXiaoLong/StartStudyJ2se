package day2;

import java.util.Scanner;

public class Login {
   public static void main(String[] args) {
	   @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	for(int i = 0;i < 3;i++){
		System.out.println("�������û�����");
		String user = scan.next();
		System.out.println("���������룺");
		String password = scan.next();
		if("admin".equals(user) && "asjy".equals(password)){
			System.out.println("��½�ɹ���");
			break;
		}else{
			if(i <2){
			System.out.println("�������!���������룡");
			}else{
			System.out.println("�������ﵽ���Σ��˳���");
			}
		}
	}
   }
}
