package day9;

import java.io.FileInputStream;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("F:\\text.txt");
		FileInputStream  fis = new FileInputStream("F:\\text.txt");
		fw.write("啊cdefg");
		fw.close();
		//璇诲彇绗竴涓厓绱�
		int read = fis.read();
		System.out.println((char)read);
		//璇诲彇鎵�鏈夊厓绱�
		/*byte[] ch = new byte[1024];
		int len = fis.read(ch);
		System.out.println(new String(ch,0,len));
		fis.close();*/
		
		
		/*FileReader fr = new FileReader("F:\\text.txt");
		FileWriter fw = new FileWriter("F:\\test1.txt");
		char[] ch = new char[1024];
		int a = 0;
		while((a = fr.read(ch)) != -1){
		fw.write(ch, 0, a);
		}
		fr.close();
		fw.close();*/
	}

}
