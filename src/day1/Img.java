package day1;

import java.util.Scanner;

/**
1、	求图形的周长和面积。具体要求如下：
a)	通过键盘输入长方形的长和宽，输入前给出相应的提示，求出长方形的周长和面积并输出
b)	通过键盘输入正方形的边长，输入前给出相应的提示，求出正方形的周长和面积并输出
c)	通过键盘输入圆形的半径，输入前给出相应的提示，求出圆形的周长和面积并输出
d)	通过键盘输入三角形的边长，输入前给出相应的提示，求出三角形的周长和面积并输出
d = (a+b+c)/2; 面积 = Math.sqrt(d*(d-a)*(d-b)*(d-c))
 */

public class Img {
  public static void main(String[] args) {
	  double a = 0;
	  double b = 0;
	  double c = 0;
	  double area = 0;
	  double perimeter = 0;
	  double weigh = 0;
	  double heigh = 0;
	  @SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
	  System.out.println("请输入长方形的宽和高！");
	  weigh = scan.nextDouble();
	  heigh = scan.nextDouble();
	  perimeter = (heigh + weigh) * 2.0;
	  area =  heigh *  weigh;
	  System.out.println("长方形的周长是：" + perimeter + "  长方形的面积是：" + area);
	  System.out.println("------------------------------------------------------------------");
	  System.out.println("请输入正方形的边长！");
	  heigh = scan.nextDouble();
	  perimeter = heigh * 4;
	  area = heigh * heigh;
	  System.out.println("正方形的周长是：" + perimeter + "  正方形的面积是：" + area);
	  System.out.println("------------------------------------------------------------------");
	  System.out.println("请输入圆的半径！");
	  heigh = scan.nextDouble();
	  perimeter = 2*Math.PI*heigh;
	  area = Math.PI*heigh*heigh;
	  System.out.println("圆的周长是：" + perimeter + "  圆的面积是：" + area);
	  System.out.println("------------------------------------------------------------------");
      System.out.println("请输入三角形的三边长！");
      a = scan.nextDouble();
	  b = scan.nextDouble();
	  c = scan.nextDouble();
	  if(a < b + c && b < a + c && c < a + b){
		  perimeter = (a+b+c)/2.0;
		  area = Math.sqrt(perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c));
		  System.out.println("三角形的周长是：" + perimeter + "  三角形的面积是：" + area);
	  }else{
		  System.out.println("不能构成三角形！");
	  }
	  System.out.println("------------------------------------------------------------------");
	
  }
}
