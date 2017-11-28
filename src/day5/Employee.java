package day5;

public class Employee {
   private String name;
   private int age ;
   private String position;
   private double salary ;
   Employee(){
	   
   }
   public void setName( String name){
	   this.name = name ;
   }
   public void setAge(int age){
	   if(age > 18){
		   this.age = age ;
	   }else{
		   this.age = 18;
	   }
	  
   }
  
   public void setPosition(String position ){
	   if("销售员".equals(position) || "售后服务".equals(position)){
		   this.position = position;
	   }else{
		   this.position = "售后服务";
	   }
	  
   }
   public void setSalary(int age){
	   if(age >= 18 && age <= 20){
		   this.salary = 1000;
	   }else if(age >= 21 && age <= 25){
		   this.salary = 1500;
	   }else if(age >= 26 && age <= 30){
		   this.salary = 2000;
	   }else if(age >= 31 && age <= 40){
		   this.salary = 3000;
	   }else if(age >= 41 && age <= 50){
		   this.salary = 35000;
	   }else{
		   this.salary = 4000;
	   }
   }
   public String getName(){
	   return this.name;
   }
   public int getAge(){
	   return this.age;
   }
   
   public String getPosition(){
	   return this.position;
   }
   
   public double getSalary(){
	   return this.salary;
   }
   
   
   
	
}
