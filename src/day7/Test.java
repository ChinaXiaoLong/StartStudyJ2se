package day7;

class Test{
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.show();
		System.out.println("----------------------------------------------");
		Bus bus1 = new Bus("黑色",4,"08:00","18:00",60);
		bus1.show();
		System.out.println("----------------------------------------------");
		System.out.println("----------------------------------------------");


		Bicycle ab = new Autocycle();
		ab.show();
		System.out.println("----------------------------------------------");

		Bicycle ab1 = new Autocycle("白色", 4 ,24 ,50);
		ab1.show();
	}
}

abstract class Car {
	String color;
	int tyre ;
	Car(){
		this.color = "黑色";
		this.tyre = 0 ;
	}
	Car(String color, int tyre){
		this.color = color ;
		this.tyre = tyre ;
	}
	abstract void show();
}

class  Bus extends Car{
	String startTime;
	String endTime;
	int passenger;
	Bus(){
		super();
		this.startTime = "00:00";
		this.endTime = "00:00";
	    this.passenger = 0;
	}
	Bus(String color , int tyre ,String startTime ,String endTime , int passenger){
		super(color , tyre);
		this.startTime = startTime ;
		this.endTime = endTime ;
		this.passenger = passenger ;
	}

	@Override
	void show() {
		System.out.println("颜色：" + this.color + "轮胎个数是：" + "出发时间是：" + this.startTime + "末班时间见是：" + this.endTime + "载客量：" + this.passenger);
		
	}
	public void function(){
		if(passenger > 50){
			System.out.println("这是一辆大汽车，可以用作公交车");
		}else{
			System.out.println("这是一辆小汽车可以用作班车");
		}
		
	}
	
}


class Bicycle extends Car{
	int type;
	Bicycle(){
		super();
		this.type = 24 ;
	}
	Bicycle(String color , int tyre ,int type  ){
		super(color , tyre);
		this.type = type ;
	}
	

	@Override
	void show() {
		System.out.println("颜色：" + this.color + "轮胎个数是：" + "类型：" + this.type);
		
	}
	public void ride(){
		if(type < 16){
			System.out.println("这个自行车适合儿童使用");
		}else{
			System.out.println("这个自行车适合成年人使用");
		}
	}
	
}
class Autocycle extends Bicycle{
	int gas ;
	Autocycle(){
		super();
		this.gas = 0;
	}
	Autocycle(String color , int tyre ,int type,int gas){
		super(color , tyre ,type);
		this.gas = gas ;
	}
	

	@Override
	void show() {
		System.out.println("颜色：" + this.color + "轮胎个数是：" + "类型：" + this.type + "百里油耗：" + this.gas);
		
	}
}









