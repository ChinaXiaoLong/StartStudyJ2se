package day6;

public class Student extends Person {
 int sutClass;//�༶
  Student(String name ,int age ,String sex,int sutClass){
	  super(name, age, sex);
	  this.sutClass = sutClass;
  }
  public void study(String subject){
	  System.out.println(this.name + "����ѧϰ" + subject);
  }
  public void show(){
	   System.out.println("�����ǣ�" + this.name +  "\n�����ǣ�" + this.age + "\n�Ա��ǣ�" + this.sex + "�༶�ǣ�" + this.sutClass);

 }
  
}
