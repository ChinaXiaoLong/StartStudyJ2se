package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
1) 把//1 处的代码补充完整，要求输出list 中所有元素的内容 
2) 写出程序执行的结果
3) 如果要把实现类由ArrayList 换为LinkedList，应该改哪里？ArrayList 和 LinkedList 使用上有什么区别？实现上有什么区别？ 
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
// 输出list 中所有元素的内容 i
		//根据下角标遍历
		/*for(int i = 0 ;i < list.size(); i ++ ){
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		//for each 遍历
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
