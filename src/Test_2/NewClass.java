package Test_2;

import java.util.Scanner;

public class NewClass {
    public int test(){
        Scanner Stroka = new Scanner(System.in);
        System.out.println("Enter 1 number: ");
        int num1 = Stroka.nextInt();
        System.out.println("Enter 2 number: ");
        int num2 = Stroka.nextInt();
        System.out.println("result of method: " + (num1 + num2));
        return num1;
    }
}
