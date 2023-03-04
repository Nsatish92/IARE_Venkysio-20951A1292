import java.util.*;
public class Main extends Thread{
  public static void main(String args[]){
    Main obj = new Main();
    obj.start();
  } 
  public void run(){
    String s="hello";
    String rev="";
    for(int i=0;i<s.length();i++){
      rev=s.charAt(i)+rev;
    }
    System.out.println(rev);
  }
}
