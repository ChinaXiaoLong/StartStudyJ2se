package day2;

public class Test5 {
  public static void main(String[] args) {
	  System.out.println("计算1*2*3+4*5*6+…+100*101*102的值");
	 int sum = 0;
	 for(int i = 1; i <= 100;i += 3){
		 sum = sum + i * (i + 1) * ( i + 2);
	 }
	 System.out.println( "值为："+ sum);
  }
}
