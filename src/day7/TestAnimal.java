package day7;

/*
5、创建类TestAnimal，包含主方法
a)创建猫、鱼、鸟类各一个对象，分别给它们的属性赋值，输出的效果参照“我是大连的一只猫，我叫安哥拉猫，白色的”
b)使用每个对象分别调用各自拥有的方法

*/

public class TestAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Cat cat = new Cat();
	cat.name = "安哥拉";
	cat.color = "白色";
	cat.show();
	cat.eat("鱼");
	cat.sound();
	System.out.println("-------------------------------------------------");
	Fish fish = new Fish();
	fish.color = "金色";
	fish.type = "亚洲鲤";
	fish.show();
	fish.eat("虾米");
	fish.swim(50);
	fish.sound();
	System.out.println("------------------------------------------------");
	Bird bird = new Bird();
	bird.lo = 20 ;
	bird.show();
	bird.eat("虫子");
	bird.fly();
	bird.sound();

	}

}

interface Animal{
	public static final String city = "大连" ;
	void eat(String food);
	void sound();
}

class Cat implements Animal{
	String name;
	String color;

	public void eat(String food) {
		System.out.println("猫吃" + food);
		
	}

	public void sound() {
		System.out.println("猫喵喵叫");
		
	}
	
	
	public void show(){
		System.out.println("我是一只" + city + "猫，我叫" + this.name + this.color + "的！");
	}
	
}

class Fish implements Animal{
	String type ;
	String color;
	public void eat(String food) {
		System.out.println("鱼吃" + food);
	}

	public void sound() {
		System.out.println("鱼不会叫");
		
	}
	 public void swim(int speed){
		 System.out.println("鱼的游速是每小时" + speed + "公里");
	 }
	 public void show(){
			System.out.println("我是一只" + city + "的鱼，类型是" + this.type + this.color + "的！");
		}
	
}



class Bird implements Animal{
	int lo ;
	public void eat(String food) {
		System.out.println("鸟吃虫子!");
		
	}

	public void sound() {
		System.out.println("鸟儿渣渣叫！");
	}
	public void fly(){
		System.out.println("鸟儿天生就会飞");
	}
	public void show(){
		System.out.println("我是一只" + city + "的鸟，体长" + this.lo + "cm");
	}
	
}











