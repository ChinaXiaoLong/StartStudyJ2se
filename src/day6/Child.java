package day6;

public class Child extends Person {
  String kindergarten;  //�����׶�԰
  
  Child(String name ,int age ,String sex ,String kindergarten ){
	  super(name, age, sex);
	  this.kindergarten = kindergarten;
  }
  public void show(){
	   System.out.println("�����ǣ�" + this.name +  "\n�����ǣ�" + this.age + "\n�Ա��ǣ�" + this.sex + "�����׶�԰" + this.kindergarten);

  }
  
  public void game(String gameName){
	  System.out.println(super.name + "С����������" + gameName);
  }
}
