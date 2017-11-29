package day10;

public class StringIndexOutOf {
	public static void main(String[] args) {
		/*1.  
		运行时主方法参数输入 abc 有下列程序异常
        */ 
	System.out.println("字符串索引越界异常");
	
		String str=args[0];
	try{
	System.out.println("第四个字符为"+str.charAt(3)); 
	}catch(StringIndexOutOfBoundsException e){
		System.out.println(e.getMessage());
		System.out.println("数组下标越界");
	}
	try{
	int aa=Integer.parseInt(args[0]);
	 System.out.println("平方为 " + aa*aa);
	}catch(NumberFormatException e){
		System.out.println(e.toString());
		System.out.println("转型错误！");
	}
	
	System.out.println("over");
	}
}
