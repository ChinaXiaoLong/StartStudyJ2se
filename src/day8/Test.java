package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*1������һ��Employee�࣬��������empName��empAge��empSex���������������췽����ͨ�����������Ը�ֵ��
2������һ��Test�࣬����main�����������ڸ÷����д���һ��List����ʹ��ArrayList�����ʵ������ѭ�������û��Ӽ�������Ա�������֡����䡢�Ա𣬸����û��������Ϣ����Employee���󣬲���ӵ������У�ÿ����������������û��Ƿ������ֱ���û����ټ�����ֹͣѭ��
3��������ѭ���ķ�ʽ(for��foreach��iterator)��ʾ����������Ա������Ϣ
4��ͨ����������һ��Ա�������������Ҹ�Ա���Ƿ����
*/

public class Test {
  @SuppressWarnings("resource")
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	List<Employee> list = new ArrayList<Employee>();
	String isGo;
	do{
		System.out.println("����Ա�����������䡢�Ա�");
		Employee p = new Employee(scan.next() ,scan.nextInt() ,scan.next());
		System.out.println("�Ƿ������y��-���� ��������-�˳���");
		list.add(p);
		isGo = scan.next();
	}while("y".equals(isGo));
	
	//for����
	System.out.println("=======================for����==========================");
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
		System.out.println("������" + this.empName + "\n���䣺" + this.empAge + "\n�Ա�" + this.empSex);
	}
	
	
}