package day5;
public class Draw {
	private double drawRound;//ͼ�ε��ܳ�
	Draw(){
		
	}
	public void round(double r){
		this.drawRound = 2 * Math.PI *r ;
		System.out.println("��Բ���ܳ��ǣ�" + this.drawRound);
	}
	public void round(int length ,int width){
		this.drawRound = length * width * 2 ;  
		System.out.println("�ó����ε��ܳ��ǣ�" + this.drawRound);

	}
	public void round(int length){
		this.drawRound = 4 * length ; 
		System.out.println("�������ε��ܳ��ǣ�" + this.drawRound);

	}
	public void round(int a ,int b , int c){
		if(a < b + c && b < a + c && c < a + b){
			this.drawRound = a + b + c;  
			System.out.println("�������ε��ܳ��ǣ�" + this.drawRound);
		}else{
			System.out.println("��������");
		}
	}
	
	
}
