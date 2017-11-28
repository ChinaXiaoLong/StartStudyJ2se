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
			System.out.println("请输入姓名、电话！");
			tel.put(scan.next(), scan.next());
			System.out.println("是否继续？【y】-继续【其他】-退出！");
			isGo = scan.next();
		}while("y".equals(isGo));
		
		//遍历获取键的set视图
		System.out.println("============================获取键的set视图通过迭代器遍历===============================");
		Set<String> keySet = tel.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println("姓名：" + next + "  " + "电话：" + tel.get(next) );
		}
		
		System.out.println("============================获取键的set视图利用foreach遍历============================");
		for (String str : keySet) {
			System.out.println("姓名：" + str + "  " + "电话：" + tel.get(str));
		}
		System.out.println("============================获取键值对视图分别取键、值遍历==foreach=======================");

		Set<Entry<String, String>> entrySet = tel.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.println("姓名：" + entry.getKey() + "  " + "电话是：" + entry.getValue());
		}
		System.out.println("============================获取键值对视图分别取键、值遍历==iterator=====================");
		Iterator<Entry<String, String>> iterator2 = entrySet.iterator();
        while(iterator2.hasNext()){
        	Entry<String, String> next = iterator2.next();
        	System.out.println("姓名：" + next.getKey() + "  " + "年龄：" + next.getValue());
        }
        
        System.out.println("请输入你要查询人的姓名：");
        String name = scan.next();
        boolean a = tel.containsKey(name);
        if(a == true){
        	System.out.println(name + "的电话是：" + tel.get(name));
        }else{
            System.out.println("没有此人！");
        }
	 }
	 
}
