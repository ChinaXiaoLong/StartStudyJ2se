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
		int c;                             //����insert����ֵ
		String isGo = null;
		int b;                            //���ղ��ҷ���ֵ
		int num = 0;
		int[] arr = new int[10];
		//�Ѹ�������������
		do{
			System.out.println("������һ������");
			num = scan.nextInt();
			if(num != 0){
				b = find(arr,num);
				if(b == 10){
					c = insert(arr, num);
					if(c == 10){
						System.out.println("������������");
					}else{
					   arr[c] = num ;
					   System.out.println("�Ƿ��������y��->������  ��������->�˳���");
					   sum ++ ;
					   if(sum < 10){
						   isGo = scan.next();
					   }else{
						   System.out.println("�����������ܼ�����ӣ�");
					   }
						
					}
				}else{
					System.out.println("�ҵ�����λ��" + b + "��");
				}
			}else{
				System.out.println("�����������������룡");
				isGo = "y";
			}
		}while("y".equals(isGo) && sum != 10);
		//��������
		System.out.print("����Ϊ��");
		for(int i :arr){
			System.out.print(i + "  ");
		}
	}
//�����ж��Ƿ��Ѵ���
	public static int find(int arr[],int num){
		int end = arr.length;
		int str = 0;
		int mid;
		boolean a = false ;
		
	//ð������
		for(int i = 1 ;i < arr.length ;i ++){
			for(int j = 0; j < arr.length -i;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		//���ֲ���
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
	//�����в��ҵ�һ��Ϊ0��Ԫ�أ���num��ֵ��ӵ���λ�ã���������ӳɹ�֮���λ��
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
