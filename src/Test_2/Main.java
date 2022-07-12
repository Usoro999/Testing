package Test_2;


import java.util.Scanner;

public class Main {
    public static String getNumberExplanation(int num) {
        String answer;
        switch(num){
            case 666:
                return "devil number";

            case 42:
                return "answer for everything";

            case 7:
                return "prime number";

        }
        return "WF";
    }
    public static void main(String[] args){
        getNumberExplanation(666);
    }
}
