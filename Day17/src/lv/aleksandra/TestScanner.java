package lv.aleksandra;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String userInput = scanner.nextLine();
       // System.out.println(userInput);
        try {
            System.out.println("Input only int");
            int var = scanner.nextInt();
            System.out.println("Your input is "+var);
        }catch(Exception e){
            System.out.println("User input wrong int error: "+e);
        }finally {
            scanner.close();
        }
       Scanner sc = new Scanner(System.in);
        int varNum = sc.nextInt();
        System.out.println(varNum);
    }
}
