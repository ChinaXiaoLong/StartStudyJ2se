package day6;
public class TestAnimal {
  public static void main(String[] args) {
	  //猫类
	Animal cat = new Cat("加菲猫","会","灰色");
	cat.showAnimal();
	cat.eatFood();
	//鱼类
	Animal fish = new Fish("金鱼","不会","金色");
	fish.showAnimal();
	fish.eatFood();
	//鸟类
	Animal bird = new Bird();
	bird.showAnimal();
	bird.eatFood();
	
  }
}
