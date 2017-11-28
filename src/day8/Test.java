package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*1．创建一个Employee类，包含属性empName、empAge、empSex，包含带参数构造方法，通过参数给属性赋值；
2．创建一个Test类，包含main（）方法，在该方法中创建一个List对象，使用ArrayList类进行实例化；循环接受用户从键盘输入员工的名字、年龄、性别，根据用户输入的信息创建Employee对象，并添加到集合中，每次输入结束，提问用户是否继续，直到用户不再继续则停止循环
3．以三种循环的方式(for、foreach、iterator)显示集合中所有员工的信息
4．通过键盘输入一个员工的姓名，查找该员工是否存在
*/

public class Test {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	List<Employee> list = new ArrayList<Employee>();
	String isGo;
	do{
		System.out.println("输入员工姓名、年龄、性别");
		Employee p = new Employee(scan.next() ,scan.nextInt() ,scan.next());
		System.out.println("是否继续【y】-继续 【其他】-退出！");
		list.add(p);
		isGo = scan.next();
	}while("y".equals(isGo));
	
	//for遍历
	System.out.println("=======================for遍历==========================");
	 for(int i = 0 ; i < list.size() ; i ++){
		list.get(i).show();
	  }
	 System.out.println("======================for each================================");
	 for (Employee employee : list) {
		employee.show();
	}
	 System.out.println("======================itrator================================");
     Iterator<Employee> iterator = list.iterator();
     while(iterator.hasNext()){
    	 iterator.next().show();
     }
	 
	 
	 
  }
}

class Employee{
	String empName;
	int empAge;
	String empSex;
	Employee(String name, int age,String Sex){
		this.empName = name ;
		this.empAge = age ;
		this.empSex = Sex ;
	}
	
	public void show(){
		System.out.println("姓名：" + this.empName + "\n年龄：" + this.empAge + "\n性别：" + this.empSex);
	}
	
	
}