package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
1) ��//1 ���Ĵ��벹��������Ҫ�����list ������Ԫ�ص����� 
2) д������ִ�еĽ��
3) ���Ҫ��ʵ������ArrayList ��ΪLinkedList��Ӧ�ø����ArrayList �� LinkedList ʹ������ʲô����ʵ������ʲô���� 
*/

public class HomeWork1 {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add(1, "Learn");
		list.add(1, "Java");
		printList(list);
	}

	public static void printList(List<String> list) { 
// ���list ������Ԫ�ص����� i
		//�����½Ǳ����
		/*for(int i = 0 ;i < list.size(); i ++ ){
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		//for each ����
		System.out.println("=====================================");
		for(String lis : list){
			System.out.print(lis + "  ");
		}
		System.out.println();
		System.out.println("=====================================");*/
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "  ");
		}

	}
}
