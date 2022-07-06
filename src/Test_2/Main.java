package Test_2;

import java.util.Scanner;

public class Main {
   public static char getLastChar(String a){
      return a.charAt(a.length() - 1);
   }
   public static void main(String[] args){
       Scanner Stroka = new Scanner(System.in);
       String text = Stroka.nextLine();
       System.out.println(getLastChar(text));

   }

}
