package day3;

public class Lottery {
	/*5．数组的应用
	实现双色球的机选功能：
	    双色球的构成：6个红号+1个蓝号，红号的范围是1-33，蓝号的范围是1-16。
	声明一个长度为6的整型数组，存储6个不同的1-33之间的随机数；声明一个变量，存储1-16之间的随机数；输出机选的号码。
	效果图如下：
	本期双色球机选号码如下：
	红号：3 10 17 23 29 30 蓝号：14*/
	public static void main(String[] args) {
		int[] read = new int[6];
		int c = 0;//数组中与随机生成的数相同的数
		int blue;
		int b = 0;//生成的一个随机数
		int count = 0;//统计生成的随机数个数
		//int  b = (int)Math.round((Math.random() * 33));
		System.out.println();
		
		System.out.println("------------本期双色球的机选号码为-----------------");
		System.out.println();
		do{
			b = (int)Math.round((Math.random() * 33));
			for(int j = 0 ; j < 6; j++){
				if(b ==read[j]){
					c = read[j];
					break;
				}
			}
			if(b != c){
			read[count] = b;
			count ++;
			}else{
				continue;
			}
		}while(count < 6);
		System.out.print("红号：");
		for(int a :read){
			System.out.print(a + "  ");
		}
		
		blue = (int)Math.round((Math.random() * 16));
		System.out.println("蓝号：" + blue);
		
		//排序：从小到大排序
		//先对数组排序
		
		for(int i = 0; i < 6 ; i ++){
			
			for(int j = 0 ; j < 5; j ++){
				if(read[j] > read[j + 1]){
					int temp = read[j];
					read[j] = read[j + 1];
					read[j + 1] = temp;
				}
			}
		}
		System.out.println("-----排序后---------------");
		for(int s : read){
			System.out.print(s + "  ");
		}
		
	}

}
