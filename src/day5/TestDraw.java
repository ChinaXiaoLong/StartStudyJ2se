package day5;

import java.util.Scanner;

public class TestDraw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Draw circle = new Draw();//Բ
		System.out.println("����Բ�İ뾶��");
		circle.round(scan.nextDouble());
		
		Draw rectangle = new Draw();//������
        System.out.println("�����볤���εĳ��Ϳ�");
        rectangle.round(scan.nextInt(),scan.nextInt());
        
    	Draw square = new Draw();//������
    	System.out.println("���������εı߳���");
    	square.round(scan.nextInt());
    	
    	Draw triangle = new Draw();//������
    	System.out.println("���������ε����߳���");
    	triangle.round(scan.nextInt(),scan.nextInt(),scan.nextInt());

	}

}
