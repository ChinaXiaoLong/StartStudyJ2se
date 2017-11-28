package day7;

/*
5��������TestAnimal������������
a)����è���㡢�����һ�����󣬷ֱ�����ǵ����Ը�ֵ�������Ч�����ա����Ǵ�����һֻè���ҽа�����è����ɫ�ġ�
b)ʹ��ÿ������ֱ���ø���ӵ�еķ���

*/

public class TestAnimal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Cat cat = new Cat();
	cat.name = "������";
	cat.color = "��ɫ";
	cat.show();
	cat.eat("��");
	cat.sound();
	System.out.println("-------------------------------------------------");
	Fish fish = new Fish();
	fish.color = "��ɫ";
	fish.type = "������";
	fish.show();
	fish.eat("Ϻ��");
	fish.swim(50);
	fish.sound();
	System.out.println("------------------------------------------------");
	Bird bird = new Bird();
	bird.lo = 20 ;
	bird.show();
	bird.eat("����");
	bird.fly();
	bird.sound();

	}

}

interface Animal{
	public static final String city = "����" ;
	void eat(String food);
	void sound();
}

class Cat implements Animal{
	String name;
	String color;

	public void eat(String food) {
		System.out.println("è��" + food);
		
	}

	public void sound() {
		System.out.println("è������");
		
	}
	
	
	public void show(){
		System.out.println("����һֻ" + city + "è���ҽ�" + this.name + this.color + "�ģ�");
	}
	
}

class Fish implements Animal{
	String type ;
	String color;
	public void eat(String food) {
		System.out.println("���" + food);
	}

	public void sound() {
		System.out.println("�㲻���");
		
	}
	 public void swim(int speed){
		 System.out.println("���������ÿСʱ" + speed + "����");
	 }
	 public void show(){
			System.out.println("����һֻ" + city + "���㣬������" + this.type + this.color + "�ģ�");
		}
	
}



class Bird implements Animal{
	int lo ;
	public void eat(String food) {
		System.out.println("��Գ���!");
		
	}

	public void sound() {
		System.out.println("��������У�");
	}
	public void fly(){
		System.out.println("��������ͻ��");
	}
	public void show(){
		System.out.println("����һֻ" + city + "�����峤" + this.lo + "cm");
	}
	
}











