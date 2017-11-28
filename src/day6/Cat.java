package day6;
public class Cat extends Animal {
	//构造方法
	Cat(){
		setName("波斯猫");
		setSound("true");
		setColor("白色");
	}
   Cat(String name ,String sound ,String color){
	  super(name,sound,color);
   }
   public void eatFood(){
	   System.out.println("猫吃竹子");
   }
   
   
}
