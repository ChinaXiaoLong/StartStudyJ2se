package day5;

public class TestGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NetGame n1 = new NetGame();
		NetGame n2 = new NetGame();
		NetGame n3 = new NetGame();
		n1.setGameName("Ӣ������");
		n1.setGameServer("����");
		n1.setGameLevel(20);
        System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("��Ϸ����" + n1.getGameName() + "\n������" + n1.getGameServer() + "\n�ȼ���" + n1.getgetGameLevel() );
		n1.group(5);
		n2.setGameName("������ҫ");
		n2.setGameServer("4");
		n2.setGameLevel(30);
        System.out.println("-------------------------------------------------------------------------------------");
		n2.group(5);
		System.out.println("��Ϸ����" + n2.getGameName() + "\n������" + n2.getGameServer() + "\n�ȼ���" + n2.getgetGameLevel() );
		n3.setGameName("������");
		n3.setGameServer("��ͨ");
		n3.setGameLevel(20);
        System.out.println("-------------------------------------------------------------------------------------");
		n3.group(5);
		System.out.println("��Ϸ����" + n2.getGameName() + "\n������" + n3.getGameServer() + "\n�ȼ���" + n3.getgetGameLevel() );

		
	}

}
