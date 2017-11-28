package day2;

public class Text1 {
   public static void main(String[] args) {
	   int a = 1;
		int b = 0;
		int c = 1;
	for(int i = 1;i < 21; i++){
		c = a + b;
		a = b;
		b = c;
		System.out.println(c);
	}
   }
}
