package day4;

import java.util.Scanner;

public class Students {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	boolean trueOrfalse;
	double score;
	System.out.println("�������ж�ѧ���ĳɼ���");
	score = scan.nextDouble();
  trueOrfalse = Validate(score);
  if(trueOrfalse == true){
	  Convert(score);
  }else{
	  System.out.println("��������");
  }
	}
	
	public static boolean Validate(double score){		
		if(score > 0 && score < 101){
			return true ;
		}else{
			return false ;
		}
	}

	
	public static void Convert(double score){
		if(score > 89 && score < 101){
			System.out.println("��ѧ���ĵȼ��ǣ�A�ȼ���");
		}else if(score > 79 && score < 90){
			System.out.println("��ѧ���ĵȼ��ǣ�B�ȼ���");
		}else if(score > 69 && score < 80){
			System.out.println("��ѧ���ĵȼ��ǣ�C�ȼ���");
		}else if(score > 59 && score < 70){
			System.out.println("��ѧ���ĵȼ��ǣ�D�ȼ���");
		}else{
			System.out.println("��ѧ���ĵȼ��ǣ�X�ȼ���");
		}
	}
	
	
}
