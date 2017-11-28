package day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyMp3 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("F:\\电影\\韩庚 - 一生所爱.mp3");
		FileOutputStream fos = new FileOutputStream("F:\\一生所爱.mp3");
		byte[] ch = new byte[1024];
		int a = 0;
		while((a = fis.read(ch)) != -1){
		fos.write(ch,0,a);
		}
		fis.close();
		fos.close();
	}

}
