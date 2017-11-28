package day6;

public class Person {
   String name;
   int age ;
   String sex;
   Person(){
	   
   }
   Person(String name ,int age ,String sex){
	   this.name = name ;
	   this.age = age ;
	   this.sex = sex;
   }
   public void show(){
	   System.out.println("姓名是：" + this.name +  "\n年龄是：" + this.age + "\n性别是：" + this.sex);
   }
	  
}
