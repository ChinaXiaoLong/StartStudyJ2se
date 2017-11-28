package day6;

public class Bird extends Animal{
   Bird(){
	   super("ÂéÈ¸","true","ºÖÉ«");
   }
   Bird(String name, String sound ,String color){
	   super(name,sound,color);
   }
   public void eatFood(){
	   System.out.println("ÂéÈ¸³Ô³æ×Ó£¡");
   }
	
}
