package day8;

import java.util.*;
import java.util.Map.Entry;
public class Tel {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		 String isGo;
		Map<String,String> tel = new HashMap<String,String>();
		do{
			System.out.println("�������������绰��");
			tel.put(scan.next(), scan.next());
			System.out.println("�Ƿ��������y��-������������-�˳���");
			isGo = scan.next();
		}while("y".equals(isGo));
		
		//������ȡ����set��ͼ
		System.out.println("============================��ȡ����set��ͼͨ������������===============================");
		Set<String> keySet = tel.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println("������" + next + "  " + "�绰��" + tel.get(next) );
		}
		
		System.out.println("============================��ȡ����set��ͼ����foreach����============================");
		for (String str : keySet) {
			System.out.println("������" + str + "  " + "�绰��" + tel.get(str));
		}
		System.out.println("============================��ȡ��ֵ����ͼ�ֱ�ȡ����ֵ����==foreach=======================");

		Set<Entry<String, String>> entrySet = tel.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("������" + entry.getKey() + "  " + "�绰�ǣ�" + entry.getValue());
		}
		System.out.println("============================��ȡ��ֵ����ͼ�ֱ�ȡ����ֵ����==iterator=====================");
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
        while(iterator2.hasNext()){
        	Entry<String, String> next = iterator2.next();
        	System.out.println("������" + next.getKey() + "  " + "���䣺" + next.getValue());
        }
        
        System.out.println("��������Ҫ��ѯ�˵�������");
        String name = scan.next();
        boolean a = tel.containsKey(name);
        if(a == true){
        	System.out.println(name + "�ĵ绰�ǣ�" + tel.get(name));
        }else{
            System.out.println("û�д��ˣ�");
        }
	 }
	 
}
