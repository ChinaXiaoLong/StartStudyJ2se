package day5;
public class Draw {
	private double drawRound;//图形的周长
	Draw(){
		
	}
	public void round(double r){
		this.drawRound = 2 * Math.PI *r ;
		System.out.println("该圆的周长是：" + this.drawRound);
	}
	public void round(int length ,int width){
		this.drawRound = length * width * 2 ;  
		System.out.println("该长方形的周长是：" + this.drawRound);

	}
	public void round(int length){
		this.drawRound = 4 * length ; 
		System.out.println("该正方形的周长是：" + this.drawRound);

	}
	public void round(int a ,int b , int c){
		if(a < b + c && b < a + c && c < a + b){
			this.drawRound = a + b + c;  
			System.out.println("该三角形的周长是：" + this.drawRound);
		}else{
			System.out.println("输入有误！");
		}
	}
	
	
}
