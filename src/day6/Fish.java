package day6;
	/*3．创建一个鱼类Fish，继承Animal类：
	方法：
	i.默认构造方法，给属性分别赋值为“金鱼”、false、“红色”；
	ii.带3个参数的构造方法，先调用父类的带参数的构造方法，将本构造方法中参数接受的值传递给父类的构造方法
	iii.重写eatFood()，输出鱼类应该吃的食物*/
public class Fish extends Animal {
  Fish(){
	 setName("金鱼"); 
	 setSound("false");
	 setColor("红色");
  }
  Fish(String name ,String sound ,String color){
	 super(name , sound ,color); 
  }
  public void eatFood(){
	  System.out.println("鱼吃虾米");
  }
}
