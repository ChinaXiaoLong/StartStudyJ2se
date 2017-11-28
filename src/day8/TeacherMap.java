package day8;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TeacherMap {

	public static void main(String[] args) {
		Map<String, String> teacher = new TreeMap<String ,String >();
        teacher.put("李老师", "j2se");
        teacher.put("蒋老师", "JSP");
        teacher.put("Lucy", "web前端");
        teacher.put("王老师", "JSP");
        teacher.put("张老师", "数据库");
        teacher.put("杨老师", "JSP");
        teacher.put("洪老师", "高数");
        teacher.put("赵老师", "离散数学");
        teacher.put("麻老师", "JSP");
        //增加了一位新老师Allen 教JDBC
        teacher.put("Allen", "JDBC");
        //Lucy 改为教CoreJava put方法 
        teacher.put("Lucy", "CoreJava");
        //输出所有的老师及老师教授的课程(Set<MAP.ENTRY>、Set get(key))
        System.out.println("-----------------所有课程安排-------------------");
        Set<Entry<String, String>> set = teacher.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();
        while(it.hasNext()){
        	Entry<String, String> next = it.next();
        	System.out.print(next.getKey() + "  " + next.getValue());
        	System.out.println();
        }
        
        //5） *利用Map，输出所有教JSP 的老师
        System.out.println("---------教JSP的老师有如下-----------------------------");
        Set<String> key = teacher.keySet();
        for (String str : key) {
			String value = teacher.get(str);
			if("JSP".equals(value)){
				System.out.print(str + "   ");
			}
		}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
