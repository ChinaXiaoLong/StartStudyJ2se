package day8;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TeacherMap {

	public static void main(String[] args) {
		Map<String, String> teacher = new TreeMap<String ,String >();
        teacher.put("����ʦ", "j2se");
        teacher.put("����ʦ", "JSP");
        teacher.put("Lucy", "webǰ��");
        teacher.put("����ʦ", "JSP");
        teacher.put("����ʦ", "���ݿ�");
        teacher.put("����ʦ", "JSP");
        teacher.put("����ʦ", "����");
        teacher.put("����ʦ", "��ɢ��ѧ");
        teacher.put("����ʦ", "JSP");
        //������һλ����ʦAllen ��JDBC
        teacher.put("Allen", "JDBC");
        //Lucy ��Ϊ��CoreJava put���� 
        teacher.put("Lucy", "CoreJava");
        //������е���ʦ����ʦ���ڵĿγ�(Set<MAP.ENTRY>��Set get(key))
        System.out.println("-----------------���пγ̰���-------------------");
        Set<Entry<String, String>> set = teacher.entrySet();
        Iterator<Entry<String, String>> it = set.iterator();
        while(it.hasNext()){
        	Entry<String, String> next = it.next();
        	System.out.print(next.getKey() + "  " + next.getValue());
        	System.out.println();
        }
        
        //5�� *����Map��������н�JSP ����ʦ
        System.out.println("---------��JSP����ʦ������-----------------------------");
        Set<String> key = teacher.keySet();
        for (String str : key) {
			String value = teacher.get(str);
			if("JSP".equals(value)){
				System.out.print(str + "   ");
			}
		}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
