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
		// ����һ���������еĶ�ά���� 
		double[][] score = new double[3][4];		
		//¼������ѧ���ĸ��Ƴɼ�
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
			System.out.println("������" + name +"��HTML�ɼ�!");
			score[i][j] = scan.nextDouble();
				}else if(j == 1){
					System.out.println("������" + name +"��java�ɼ�!");
					score[i][j] = scan.nextDouble();
					
				}else if(j == 2){
					System.out.println("������" + name +"��MySQL�ɼ�!");
					score[i][j] = scan.nextDouble();
				}else{
					System.out.println("������" + name +"��JavaScript�ɼ�!");
					score[i][j] = scan.nextDouble();
				}
			}
	
		}
		
		//����ƽ����
		double subjectAvg = 0;
		double avg = 0;
		System.out.println("-----------------------------------------------------");
		avg = (score[0][0] + score[0][1] + score[0][2] + score[0][3])/4 ;
		System.out.println("Mary��ƽ�����ǣ�" + avg);
		avg = (score[1][0] + score[1][1] + score[1][2] + score[1][3])/4 ;
		System.out.println("Tom��ƽ�����ǣ�" + avg);
		avg = (score[2][0] + score[2][1] + score[2][2] + score[2][3])/4 ;
		System.out.println("Bruce��ƽ�����ǣ�" + avg);
		
		System.out.println("-----------------------------------------------------");
		subjectAvg = (score[0][0] + score[1][0] + score[2][0]) / 3 ;
		System.out.println("HTML��ƽ�����ǣ�" + subjectAvg);
		subjectAvg = (score[0][1] + score[1][1] + score[2][1] ) / 3 ;
		System.out.println("java��ƽ�����ǣ�" + subjectAvg);
		subjectAvg = (score[0][2] + score[1][2] + score[2][2] ) / 3 ;
		System.out.println("MySQL��ƽ�����ǣ�" + subjectAvg);
		subjectAvg = (score[0][3] + score[1][3] + score[2][3] ) / 3;
		System.out.println("JavaScript��ƽ�����ǣ�" + subjectAvg);
		

	}

}
