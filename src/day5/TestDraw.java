package day5;

import java.util.Scanner;

public class TestDraw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Draw circle = new Draw();//圆
		System.out.println("输入圆的半径！");
		circle.round(scan.nextDouble());
		
		Draw rectangle = new Draw();//长方形
        System.out.println("请输入长方形的长和宽！");
        rectangle.round(scan.nextInt(),scan.nextInt());
        
    	Draw square = new Draw();//正方形
    	System.out.println("输入正方形的边长！");
    	square.round(scan.nextInt());
    	
    	Draw triangle = new Draw();//三角形
    	System.out.println("输入三角形的三边长！");
    	triangle.round(scan.nextInt(),scan.nextInt(),scan.nextInt());

	}

}
