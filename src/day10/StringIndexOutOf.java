package day10;

public class StringIndexOutOf {
	public static void main(String[] args) {
		/*1.  
		����ʱ�������������� abc �����г����쳣
        */ 
	System.out.println("�ַ�������Խ���쳣");
	
		String str=args[0];
	try{
	System.out.println("���ĸ��ַ�Ϊ"+str.charAt(3)); 
	}catch(StringIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		System.out.println("�����±�Խ��");
	}
	try{
	int aa=Integer.parseInt(args[0]);
	 System.out.println("ƽ��Ϊ " + aa*aa);
	}catch(NumberFormatException e){
		System.out.println(e.toString());
		System.out.println("ת�ʹ���");
	}
	
	System.out.println("over");
	}
}
