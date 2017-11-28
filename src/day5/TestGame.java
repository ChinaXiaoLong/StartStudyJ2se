package day5;

public class TestGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NetGame n1 = new NetGame();
		NetGame n2 = new NetGame();
		NetGame n3 = new NetGame();
		n1.setGameName("英雄联盟");
		n1.setGameServer("电信");
		n1.setGameLevel(20);
        System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("游戏名：" + n1.getGameName() + "\n区名：" + n1.getGameServer() + "\n等级：" + n1.getgetGameLevel() );
		n1.group(5);
		n2.setGameName("王者荣耀");
		n2.setGameServer("4");
		n2.setGameLevel(30);
        System.out.println("-------------------------------------------------------------------------------------");
		n2.group(5);
		System.out.println("游戏名：" + n2.getGameName() + "\n区名：" + n2.getGameServer() + "\n等级：" + n2.getgetGameLevel() );
		n3.setGameName("斗地主");
		n3.setGameServer("联通");
		n3.setGameLevel(20);
        System.out.println("-------------------------------------------------------------------------------------");
		n3.group(5);
		System.out.println("游戏名：" + n2.getGameName() + "\n区名：" + n3.getGameServer() + "\n等级：" + n3.getgetGameLevel() );

		
	}

}
