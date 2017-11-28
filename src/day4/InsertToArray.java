package day4;

import java.util.Scanner;

public class InsertToArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int c;                             //接收insert返回值
		String isGo = null;
		int b;                            //接收查找返回值
		int num = 0;
		int[] arr = new int[10];
		//把该数加入数组中
		do{
			System.out.println("请输入一个数：");
			num = scan.nextInt();
			if(num != 0){
				b = find(arr,num);
				if(b == 10){
					c = insert(arr, num);
					if(c == 10){
						System.out.println("该数组已满！");
					}else{
					   arr[c] = num ;
					   System.out.println("是否继续：【y】->继续！  【其他】->退出！");
					   sum ++ ;
					   if(sum < 10){
						   isGo = scan.next();
					   }else{
						   System.out.println("数组已满不能继续添加！");
					   }
						
					}
				}else{
					System.out.println("找到了在位置" + b + "上");
				}
			}else{
				System.out.println("输入有误请重新输入！");
				isGo = "y";
			}
		}while("y".equals(isGo) && sum != 10);
		//遍历数组
		System.out.print("数组为：");
		for(int i :arr){
			System.out.print(i + "  ");
		}
	}
//排序并判断是否已存在
	public static int find(int arr[],int num){
		int end = arr.length;
		int str = 0;
		int mid;
		boolean a = false ;
		
	//冒泡排序
		for(int i = 1 ;i < arr.length ;i ++){
			for(int j = 0; j < arr.length -i;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//二分查找
		do{
			mid = (str + end)/2;
			if(num > arr[mid]){
				str = mid + 1;
			}else if(num < arr[mid]){
				end = mid - 1;
			}else{
				a = true;
				break;
			}
		}while(str < end);
		if(a == true){
			return (mid + 1);
		}else{
			return 10;
		}
	}
	//数组中查找第一个为0的元素，将num的值添加到该位置，并返回添加成功之后的位置
	public static int insert(int arr[],int num){
		int a = 10;
		for(int i = 0;i < arr.length ;i ++){
			if(i == 0){
				a = i;				
			}
		}
		return a;
	}
	
	
	
}
