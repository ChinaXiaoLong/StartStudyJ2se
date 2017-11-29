package day10;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserBize implements UserBiz{
	public Map<String,User> userTable;
	
	public UserBize(Map map){
		this.userTable = map ;
		userTable.put("admin",new User("admin","admin","Administrator","admin@123.com"));
		userTable.put("tom", new User("tom","cat","tomcat","tomcat@cat.com"));
	}

	@Override
	public void register(String username, String password, String password2, String name, String email) throws RegisterException{
	   boolean a =false;
	   boolean b =false;
	   Set key = userTable.keySet();
	   Iterator<String> it = key.iterator();
	  while(it.hasNext()){
		  String next = it.next();
		  if(next.equals(username)){
			  throw new RegisterException("�û������ڣ�");
		  }
	   }
	   if(!(password.equals(password2))){
		   throw new RegisterException("���벻һ�£�");
	   }
	   userTable.put(username,new User( username,  password, name,  email));
	   System.out.println("ע��ɹ���");
	   
	}
	@Override
	public void login(String username, String password) throws LoginException{
		//�û���¼
		boolean tag = false ;
		String pass = null;
		String name = null;
		Set set = userTable.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String next = it.next();
			if(username.equals(next)){
				tag = true;
				name = next;
				pass = userTable.get(name).getPassWord();
			}
	    }
		if(tag == false){
			throw new LoginException("�û������ڣ�");
		}else{
			if(pass.equals(password)){
				System.out.println("��½�ɹ���");
			}else{
				throw new LoginException("���벻��ȷ��");

			}
		}
		
	}
	
}










