package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class TestSet {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		List<String> fruits = new ArrayList<String>();
		Set<String> fru = new TreeSet<String>();
		for(int i = 0; i < 5 ; i ++){
			System.out.println("������ˮ�������֣�");
			String name = scan.next();
			fruits.add(name);
			fru.add(name);
		}
		System.out.println("===============����ArryList����===================");
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + "  ");
		}
		System.out.println("===============����TreeSet����===================");
		Iterator<String> it = fru.iterator();
		while(it.hasNext()){
			System.out.print(it.next() + "  ");
		}
		
	}

}
