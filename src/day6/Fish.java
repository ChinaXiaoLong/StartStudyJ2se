package day6;
	/*3������һ������Fish���̳�Animal�ࣺ
	������
	i.Ĭ�Ϲ��췽���������Էֱ�ֵΪ�����㡱��false������ɫ����
	ii.��3�������Ĺ��췽�����ȵ��ø���Ĵ������Ĺ��췽�����������췽���в������ܵ�ֵ���ݸ�����Ĺ��췽��
	iii.��дeatFood()���������Ӧ�óԵ�ʳ��*/
public class Fish extends Animal {
  Fish(){
	 setName("����"); 
	 setSound("false");
	 setColor("��ɫ");
  }
  Fish(String name ,String sound ,String color){
	 super(name , sound ,color); 
  }
  public void eatFood(){
	  System.out.println("���Ϻ��");
  }
}
