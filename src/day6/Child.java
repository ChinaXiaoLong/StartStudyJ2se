package day6;

public class Child extends Person {
  String kindergarten;  //所在幼儿园
  
  Child(String name ,int age ,String sex ,String kindergarten ){
	  super(name, age, sex);
	  this.kindergarten = kindergarten;
  }
  public void show(){
	   System.out.println("姓名是：" + this.name +  "\n年龄是：" + this.age + "\n性别是：" + this.sex + "所在幼儿园" + this.kindergarten);

  }
  
  public void game(String gameName){
	  System.out.println(super.name + "小朋友正在玩" + gameName);
  }
}
