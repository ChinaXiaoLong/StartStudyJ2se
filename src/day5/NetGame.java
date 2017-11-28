package day5;

public class NetGame {
  private String gameName;
  private String gameServer;
  private int gameLevel;
  
  public void setGameName(String gameName){
	  this.gameName = gameName;
  }
  public void setGameServer(String gameServer){
	  if("联通".equals(gameServer) || "电信".equals(gameServer) || "铁通".equals(gameServer) || "国外".equals(gameServer) ){
		  this.gameServer = gameServer;
	  }else{
		  this.gameServer = "联通";
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
	  System.out.println( "至少需要" + person + "人才能游戏！");
  }
  
}
