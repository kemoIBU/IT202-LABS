package org.example;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static <string> void main(String[] args){
        //1. Create a program that asks the user for a password. If the password is
        //right, a secret message is shown to the user.

        Scanner reader = new Scanner(System.in);

        /*String truePass = "triNulaNijeZaSvakoga";
        while(true){
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            if(Objects.equals(pass, truePass)){
                System.out.println("Apsolutno je tako.");
                break;
            }
            else{
                System.out.println("Try again.");
            }

        }*/

        //2. Create a program that asks the user for three numbers and then prints
        //their sum.

        /*
        int sum = 0;
        int read;
        System.out.println("Type the first number: ");
        read = reader.nextInt();
        sum+=read;
        System.out.println("Type the second number: ");
        read = reader.nextInt();
        sum+=read;
        System.out.println("Type the final number: ");
        read= reader.nextInt();
        sum+=read;
        System.out.println("Sum: " +sum);
        */


        /*
        //3. Create a program that reads numbers from the user and prints their sum.
        //The program should stop asking for numbers when the user enters the number 0.
        int sum=0;
        while (true){

            System.out.println("Enter a number: ");
            int read = reader.nextInt();
            if(read==0){
                System.out.println("Sum in the end: "+sum);
                break;
            }
            else{
                sum=sum+read;
                System.out.println("The sum is: " +sum);



            }

        }*/
        //Create a program that asks the user for the first number and the last
        //number and then prints all numbers between those two.

        /*
        System.out.println("Enter the first number: ");
        int firstNum= reader.nextInt();
        System.out.println("Enter the second num: ");
        int secondNum=reader.nextInt();
        while(true){
            if(firstNum>secondNum){
                break;
            }
            else {
                System.out.println(firstNum++);
            }
        }*/

        //Create a program that calculates the sum of ..., where n is a number
        //entered by the user.
        /*
        int sum=0;
        int newNum=reader.nextInt();
        for(int i=0; i<= newNum; i++){
            sum+=Math.pow(2, i);
        }
        System.out.println(sum);
        */

        /*
        //Create a method printText that prints the following string of characters
        System.out.println("How many times do you want to call this method?");
        int numberOfCalls = reader.nextInt();
        for(int i=0; i<numberOfCalls; i++) printText();
        */


        /*
        //8. Create a method called drawStarsPyramid that will accept the number of rows as a parameter and
        //print a half pyramid shape where the number of rows will be dictated by the sent parameter.

        drawStarsPyramid(5);
        */


        /*
        //9. Modify the previously created starts pyramid in a way that now you are not printing the starts
        //but in each row numbers from 1 to the current row count
        drawNumbersPyramid(5);
        //if we want to have all the numbers in the row be the same, we should print the int from the first for
        //loop instead of the integer from the inside loop

        */
        int num;
        num = drawNumber();
        int count=0;
        //System.out.println(num);
        while(true){
            System.out.println("Guess a number: ");
            int guess = reader.nextInt();
            count++;
            if(guess == num){
                System.out.println("Congratulations, your guess is correct! \n Number of guesses: "+count);
                break;
            }
            else if (guess>num){
                System.out.println("The number is lesser. \n Number of guesses: "+count);
            }
            else {
                System.out.println("The number is greater. \n Number of guesses: "+count);
            }
        }
    }
    public static void printText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java. \n");
    }

    public static void drawStarsPyramid(int numberOfRows){
        for(int i=0; i<numberOfRows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void drawNumbersPyramid(int numberOfRows){
        for(int i=1; i<=numberOfRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static int drawNumber(){
        Random random = new Random();
        int min=0;
        int max=100;
        int randomNumber = random.nextInt(max-min+1)+min;
        return randomNumber;
    }
}