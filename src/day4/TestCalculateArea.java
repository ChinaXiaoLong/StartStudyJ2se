package day4;

import java.util.Scanner;

public class TestCalculateArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		boolean d ;
		int a ,b ,c;
		System.out.println("�����������ε����߳���");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = TestDraw(a ,b, c);
		if(d == true){
			double area = CalculateArea(a, b,c);
			System.out.println("�����ε�����ǣ�" + area);
		}else{
			System.out.println("���ܹ��������Σ�");
		}
		
		
	}
	
	
	public static double CalculateArea(int a, int b,int c){
		double area = 0;
		double perimeter;
//		Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
		perimeter = a + b + c ;
		area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
		return area;		
	}
	
	public static boolean TestDraw(int a ,int b, int c){
		if(a + b > c && a + c > b && b + c > a){
			return true ;
		}else{
			return false ;
		}
		
	}

}
