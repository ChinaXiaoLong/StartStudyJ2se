package day6;

public class Student extends Person {
 int sutClass;//班级
  Student(String name ,int age ,String sex,int sutClass){
	  super(name, age, sex);
	  this.sutClass = sutClass;
  }
  public void study(String subject){
	  System.out.println(this.name + "正在学习" + subject);
  }
  public void show(){
	   System.out.println("姓名是：" + this.name +  "\n年龄是：" + this.age + "\n性别是：" + this.sex + "班级是：" + this.sutClass);

 }
  
}
