package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*��������Ҫ�� 
1) ����һ��List����List �������������ˣ�������Ϣ���£� ���� ���� ���� zhang3 18 3000 li4 25 3500 wang5 22 3200 
2) ��li4 ֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300 
3) ɾ��wang5 ����Ϣ 
4) ����for ѭ����������ӡList �����й��˵���Ϣ 
5) ���õ�����������List �����еĹ��˵���work ������ 
6) ΪWorker ����дequals �����������������䡢����ȫ�����ʱ��ŷ�true */

public class ListWorker{
	public static void main(String[] args) {
		List<Worker> worker = new ArrayList<Worker>();
		Worker w1 = new Worker();//����1
		w1.setName("zhang3");
		w1.setAge(18);
		w1.setSalary(3000);
		Worker w2 = new Worker();//����2
		w2.setName("li4");
		w2.setAge(25);
		w2.setSalary(3500);
		Worker w3 = new Worker();//����3
		w3.setName("wang5");
		w3.setAge(22);
		w3.setSalary(3200);
		Worker w4 = new Worker();//����4
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
		//����li4��λ��
		  int a = 0; 
		for(int i = 0 ; i < worker.size() ; i ++){
			if("li4".equals(worker.get(i).getName())){
				a = i ;
			}
		}
		
		worker.add(a,w4);
		//��li4֮ǰ������Ա��
		System.out.println("======================������Ա����========================");
		
		for (Worker w : worker) {
			System.out.println("----------");
			w.show();
		}
		//ɾ���������Ϣ
		  //��������λ��
		int b = 0;
		
		for(int i = 0 ; i < worker.size(); i ++){
			if("wang5".equals(worker.get(i).getName())){
				b = i ;
			}
		}
		
		worker.remove(b);
		
		System.out.println("======================ɾ��wang5��========================");
        for (Worker worker2 : worker) {
			System.out.println("----------");
			  worker2.show();
		}
      System.out.println("------------------------------------------------");
		//���õ�����������List �����еĹ��˵���work ������
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
		System.out.println("������" + this.name + "\n���䣺" + this.age + "\n���ʣ�" + this.salary);
	}
	public boolean equals(List<Worker> list,String name ,int age ,double salary){
		if("name".equals(getName()) && age == getAge() && salary == getSalary() ){
			return true ;
		}else{
			return false ;
		}
	}
}
