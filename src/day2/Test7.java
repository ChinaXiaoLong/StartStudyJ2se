package day2;

public class Test7 {
	static int a = 0;
   public static void main(String[] args) {
	for(int i =1 ;i <= 9;i++){
		for(int j = i;j < 10;j++){
			a =  i * j;
			if(a > 9){
				System.out.print(i + "*" + j +" = " +a + "    ");

			}else{
			System.out.print(i + "*" + j +" = " +a + "     ");
			}
		}
		System.out.println();
	}
   }
}
