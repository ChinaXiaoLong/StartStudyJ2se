package day5;

public class NetGame {
  private String gameName;
  private String gameServer;
  private int gameLevel;
  
  public void setGameName(String gameName){
	  this.gameName = gameName;
  }
  public void setGameServer(String gameServer){
	  if("��ͨ".equals(gameServer) || "����".equals(gameServer) || "��ͨ".equals(gameServer) || "����".equals(gameServer) ){
		  this.gameServer = gameServer;
	  }else{
		  this.gameServer = "��ͨ";
	  }
  }
  public void setGameLevel(int gameLevel){
	  if(gameLevel > 0){
		  this.gameLevel = gameLevel;
	  }else{
		  this.gameLevel = 0;
	  }
	  
  }
  
  public String getGameName(){
	  return this.gameName;
  }
  public String getGameServer(){
	  return this.gameServer;
  }
  public int getgetGameLevel(){
	  return this.gameLevel;
  }
  
  public void group(int person){
	  System.out.println( "������Ҫ" + person + "�˲�����Ϸ��");
  }
  
}
