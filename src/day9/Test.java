package day9;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Test {
	/*
	 * 字节流到字符流的转换
*/
	public static void main(String[] args) throws Exception {
		/*InputStream in = System.in;//读取键盘输入数据
		InputStream in1 = new FileInputStream("F:\\text.txt");//读取文件数据
		//将字符流向字节流转化。要启用从字节到字符的有效转换，可以从底层流读取更多字节
		InputStreamReader isr = new InputStreamReader(in);//读取
*/		
		InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\text.txt"));//综合到一句
		char[] cha = new char[1024];
		int len = isr.read(cha);
		System.out.println(new String(cha,0,len));
		isr.close();
	}

}
