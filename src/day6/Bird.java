package day6;

public class Bird extends Animal{
   Bird(){
	   super("��ȸ","true","��ɫ");
   }
   Bird(String name, String sound ,String color){
	   super(name,sound,color);
   }
   public void eatFood(){
	   System.out.println("��ȸ�Գ��ӣ�");
   }
	
}
