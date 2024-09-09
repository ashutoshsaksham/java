package basics2;

import java.util.Scanner;

public class userInput {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        System.out.print("enter your age:");
//        int age = sc.nextInt();
//
//        System.out.println("Your age is " + age);


        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int resultNumber = firstNumber + secondNumber;

        System.out.println("Your result is " + resultNumber);

        sc.close();
    }
}
