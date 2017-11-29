package day10;

import java.util.Scanner;

@SuppressWarnings("serial")
class NotSanjiaoException extends Exception{
	public NotSanjiaoException(String a){
		super(a);
	}
}


class Triangle{
	double border;
	double border1;
	double border2;
	Triangle(double border,double border1,double border2) throws NotSanjiaoException{
		if((border + border1) > border2 && (border + border2) > border1 && (border1 + border2) > border ){
			this.border = border;
			this.border1 = border1;
			this.border2 = border2;
		}else{
			throw new NotSanjiaoException("不能构成三角形！") ;
		}
		
		
	}
	public void getArea(){
		 double perimeter = (border + border1 + border2)/2.0;
		 double area = Math.sqrt(perimeter*(perimeter-border)*(perimeter - border1)*(perimeter - border2));
		 System.out.println("三角形的面积是：" + area);
	}
	public void show(){
		System.out.println("三角形的三边长为：" + this.border + ", " +  this.border1 +  ", " +  this.border2);
	}
}


public class TestTriangle {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Triangle a = null;
		try {
			System.out.println("请输入三边长！空格隔开！");
			a = new Triangle(scan.nextDouble(),scan.nextDouble(),scan.nextDouble());
		} catch (NotSanjiaoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		    e.printStackTrace();
			
		}
		if(a != null){
			a.getArea();
			a.show();
		}

	}

}

























