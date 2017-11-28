package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*完成下面的要求 
1) 创建一个List，在List 中增加三个工人，基本信息如下： 姓名 年龄 工资 zhang3 18 3000 li4 25 3500 wang5 22 3200 
2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300 
3) 删除wang5 的信息 
4) 利用for 循环遍历，打印List 中所有工人的信息 
5) 利用迭代遍历，对List 中所有的工人调用work 方法。 
6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返true */

public class ListWorker{
	public static void main(String[] args) {
		List<Worker> worker = new ArrayList<Worker>();
		Worker w1 = new Worker();//工人1
		w1.setName("zhang3");
		w1.setAge(18);
		w1.setSalary(3000);
		Worker w2 = new Worker();//工人2
		w2.setName("li4");
		w2.setAge(25);
		w2.setSalary(3500);
		Worker w3 = new Worker();//工人3
		w3.setName("wang5");
		w3.setAge(22);
		w3.setSalary(3200);
		Worker w4 = new Worker();//工人4
		w4.setName("zhao6");
		w4.setAge(24);
		w4.setSalary(3300);
		worker.add(w1);
		worker.add(w2);
		worker.add(w3);
		for (Worker worker2 : worker) {
			System.out.println("----------");
			worker2.show();
		}
		//查找li4的位置
		  int a = 0; 
		for(int i = 0 ; i < worker.size() ; i ++){
			if("li4".equals(worker.get(i).getName())){
				a = i ;
			}
		}
		
		worker.add(a,w4);
		//在li4之前插入新员工
		System.out.println("======================插入新员工后========================");
		
		for (Worker w : worker) {
			System.out.println("----------");
			w.show();
		}
		//删除王五的信息
		  //获得王五的位置
		int b = 0;
		
		for(int i = 0 ; i < worker.size(); i ++){
			if("wang5".equals(worker.get(i).getName())){
				b = i ;
			}
		}
		
		worker.remove(b);
		
		System.out.println("======================删除wang5后========================");
        for (Worker worker2 : worker) {
			System.out.println("----------");
			  worker2.show();
		}
      System.out.println("------------------------------------------------");
		//利用迭代遍历，对List 中所有的工人调用work 方法。
        Iterator<Worker> it = worker.iterator();
        while(it.hasNext()){
        	Worker next = it.next();
        	next.work();
        }
		
		
	}
}





class Worker {

	private int age;
	private String name;
	private double salary;

	public Worker() {
	}

	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void work() {
		System.out.println(name + " work");
	}
	public void show(){
		System.out.println("姓名：" + this.name + "\n年龄：" + this.age + "\n工资：" + this.salary);
	}
	public boolean equals(List<Worker> list,String name ,int age ,double salary){
		if("name".equals(getName()) && age == getAge() && salary == getSalary() ){
			return true ;
		}else{
			return false ;
		}
	}
}
