package day6;
public class Cat extends Animal {
	//���췽��
	Cat(){
		setName("��˹è");
		setSound("true");
		setColor("��ɫ");
	}
   Cat(String name ,String sound ,String color){
	  super(name,sound,color);
   }
   public void eatFood(){
	   System.out.println("è������");
   }
   
   
}
