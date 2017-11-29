package day10;

public class User {
  private String userName;
  private String passWord;
  private String userEmaile;
  private String name;
  User(String userName,String password,String name,String userEmaile){
	  this.userName = userName;
	  this.passWord = password;
	  this.name = name;
	  this.userEmaile = userEmaile;
  }
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getUserEmaile() {
	return userEmaile;
}
public void setUserEmaile(String userEmaile) {
	this.userEmaile = userEmaile;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
  
  
  
}
