package day6;
public class TestAnimal {
  public static void main(String[] args) {
	  //è��
	Animal cat = new Cat("�ӷ�è","��","��ɫ");
	cat.showAnimal();
	cat.eatFood();
	//����
	Animal fish = new Fish("����","����","��ɫ");
	fish.showAnimal();
	fish.eatFood();
	//����
	Animal bird = new Bird();
	bird.showAnimal();
	bird.eatFood();
	
  }
}
