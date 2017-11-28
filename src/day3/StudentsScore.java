package day3;

import java.util.Scanner;

public class StudentsScore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name;
		// 定义一个三行四列的二维数组 
		double[][] score = new double[3][4];		
		//录入三名学生的各科成绩
		for(int i = 0 ; i < 3 ; i ++){
			if(i == 0){
				name = "Mary";
			}else if(i == 1){
				name = "Tom	";
			}else{
				name = "Bruce";
			}
			for(int j =0 ; j < 4 ; j ++){
				if(j == 0){
			System.out.println("请输入" + name +"的HTML成绩!");
			score[i][j] = scan.nextDouble();
				}else if(j == 1){
					System.out.println("请输入" + name +"的java成绩!");
					score[i][j] = scan.nextDouble();
					
				}else if(j == 2){
					System.out.println("请输入" + name +"的MySQL成绩!");
					score[i][j] = scan.nextDouble();
				}else{
					System.out.println("请输入" + name +"的JavaScript成绩!");
					score[i][j] = scan.nextDouble();
				}
			}
	
		}
		
		//计算平均分
		double subjectAvg = 0;
		double avg = 0;
		System.out.println("-----------------------------------------------------");
		avg = (score[0][0] + score[0][1] + score[0][2] + score[0][3])/4 ;
		System.out.println("Mary的平均分是：" + avg);
		avg = (score[1][0] + score[1][1] + score[1][2] + score[1][3])/4 ;
		System.out.println("Tom的平均分是：" + avg);
		avg = (score[2][0] + score[2][1] + score[2][2] + score[2][3])/4 ;
		System.out.println("Bruce的平均分是：" + avg);
		
		System.out.println("-----------------------------------------------------");
		subjectAvg = (score[0][0] + score[1][0] + score[2][0]) / 3 ;
		System.out.println("HTML的平均分是：" + subjectAvg);
		subjectAvg = (score[0][1] + score[1][1] + score[2][1] ) / 3 ;
		System.out.println("java的平均分是：" + subjectAvg);
		subjectAvg = (score[0][2] + score[1][2] + score[2][2] ) / 3 ;
		System.out.println("MySQL的平均分是：" + subjectAvg);
		subjectAvg = (score[0][3] + score[1][3] + score[2][3] ) / 3;
		System.out.println("JavaScript的平均分是：" + subjectAvg);
		

	}

}
