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
	System.out.println("请输入判定学生的成绩：");
	score = scan.nextDouble();
  trueOrfalse = Validate(score);
  if(trueOrfalse == true){
	  Convert(score);
  }else{
	  System.out.println("输入有误！");
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
			System.out.println("该学生的等级是：A等级！");
		}else if(score > 79 && score < 90){
			System.out.println("该学生的等级是：B等级！");
		}else if(score > 69 && score < 80){
			System.out.println("该学生的等级是：C等级！");
		}else if(score > 59 && score < 70){
			System.out.println("该学生的等级是：D等级！");
		}else{
			System.out.println("该学生的等级是：X等级！");
		}
	}
	
	
}
