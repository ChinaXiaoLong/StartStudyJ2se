package day3;

public class Lottery {
	/*5�������Ӧ��
	ʵ��˫ɫ��Ļ�ѡ���ܣ�
	    ˫ɫ��Ĺ��ɣ�6�����+1�����ţ���ŵķ�Χ��1-33�����ŵķ�Χ��1-16��
	����һ������Ϊ6���������飬�洢6����ͬ��1-33֮��������������һ���������洢1-16֮���������������ѡ�ĺ��롣
	Ч��ͼ���£�
	����˫ɫ���ѡ�������£�
	��ţ�3 10 17 23 29 30 ���ţ�14*/
	public static void main(String[] args) {
		int[] read = new int[6];
		int c = 0;//��������������ɵ�����ͬ����
		int blue;
		int b = 0;//���ɵ�һ�������
		int count = 0;//ͳ�����ɵ����������
		//int  b = (int)Math.round((Math.random() * 33));
		System.out.println();
		
		System.out.println("------------����˫ɫ��Ļ�ѡ����Ϊ-----------------");
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
		System.out.print("��ţ�");
		for(int a :read){
			System.out.print(a + "  ");
		}
		
		blue = (int)Math.round((Math.random() * 16));
		System.out.println("���ţ�" + blue);
		
		//���򣺴�С��������
		//�ȶ���������
		
		for(int i = 0; i < 6 ; i ++){
			
			for(int j = 0 ; j < 5; j ++){
				if(read[j] > read[j + 1]){
					int temp = read[j];
					read[j] = read[j + 1];
					read[j + 1] = temp;
				}
			}
		}
		System.out.println("-----�����---------------");
		for(int s : read){
			System.out.print(s + "  ");
		}
		
	}

}
