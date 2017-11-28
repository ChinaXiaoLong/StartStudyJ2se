package day6;

public class Animal {
   private String name ;
   private String sound ;
   private String color;
   Animal(){
	   this.name = "怪物" ;
	   this.sound = "true" ;
	   this.color = "黑色" ;
   }
   
    Animal(String name, String sound, String color) {
	this.name = name;
	this.sound = sound;
	this.color = color;
	}
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void eatFood(){
    	System.out.println("我是一个动物，我什么都吃");
    }
  final public void showAnimal(){
	   System.out.println("这是一只" + this.color + "的" + this.name + ",它" + this.sound + "叫");
   }
}
