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
	   System.out.println("�����ǣ�" + this.name +  "\n�����ǣ�" + this.age + "\n�Ա��ǣ�" + this.sex);
   }
	  
}
