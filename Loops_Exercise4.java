import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Loops_Exercise4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //1.Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
        for(int i = 1; i <= 100; i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

        System.out.println("\n************************\n");

        //2.Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox Expected Output: Reverse
        //string: xof nworb kciuq ehT
        System.out.println("please enter a string: ");
        String userString = input.nextLine();
        Character storeLetter = 'c';
        for(int i = userString.length()-1; i >= 0; i--){
            storeLetter = userString.charAt(i);
            System.out.print(storeLetter);
        }

        System.out.println("\n************************\n");

        //3.Write a program to find the factorial value of any number entered
        //through the keyboard.
        System.out.println("please enter a number: "); // sout then click tab
        int factorialNumber = input.nextInt();
        int factorial = 1;
        for(int i = 1; i <= factorialNumber; i++){
            factorial *= i;
        }
        System.out.println(factorialNumber + "! = " + factorial);

        System.out.println("\n************************\n");

       // 4.Two numbers are entered through the keyboard. Write a program to find
       // the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.println("Please, Enter a number for base: ");
        int baseNumber = input.nextInt();
        System.out.println("And enter a number for power: ");
        int powerNumber = input.nextInt();
        int resultNumber = 1;
        for(int i = 0; i < powerNumber; i++){
            resultNumber *= baseNumber;
        }
        System.out.println(baseNumber + "^" + powerNumber + " = " + resultNumber);

        System.out.println("\n************************\n");

        //5.Write a program that reads a set of integers, and then prints the sum of
        //the even and odd integers.
        int userInputNumber, sumOdd = 0, sumEven = 0;
        do{
            System.out.println("Please, Enter any numbers (enter 0 to quit): ");
            userInputNumber = input.nextInt();
            if(userInputNumber%2==0)
                sumEven += userInputNumber;
            else
                sumOdd += userInputNumber;
            //break;
        }while(userInputNumber != 0);
        System.out.println("Odd sum = " + sumOdd + "\nEven sum = " + sumEven);

        System.out.println("\n************************\n");

        //6.Write a program that prompts the user to input a positive integer. It
        //should then output a message indicating whether the number is a prime number.
        System.out.println("please enter a number: ");
        int primeNumber = input.nextInt();
        if((primeNumber%primeNumber == 0) && (primeNumber%1==0))
            System.out.println("the number is prime ");
        else
            System.out.println("the number is not prime ");

        System.out.println("\n************************\n");

        //7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        //another for loop to print the days (Days 1 -7) for each week.
        for(int i = 1; i <= 7; i++){
            System.out.println("Week " + i);
            for(int j = 1; j <= 7; j++) {
                System.out.println("Day" + j);
            }
        }

        System.out.println("\n************************\n");

        //8.Write a program that check if the word is a palindrome or not. hint: A
        //string is said to be a palindrome if it is the same if we start reading it from
        //left to right or right to left.
        System.out.println("Please, Enter any word: ");
        String palindromeWord = input.next();
        boolean isPalindrome = false;
        //peep -> last index = first index, second last index = second index
        // hello -> length 5-1 -- naelah -> length 6-1
        for(int i = 0; i < palindromeWord.length()/2; i++){
            if(palindromeWord.charAt(i) == palindromeWord.charAt(palindromeWord.length()-1-i)){
                // first and last indices [0]==[length-1]. then [1]==[length-2]...
                isPalindrome = true;
            }
            else{
                isPalindrome = false;
                break;
            }

        }
        if(isPalindrome)
            System.out.println("The word " + palindromeWord + " is Palindrome ");
        else
            System.out.println("The word " + palindromeWord + " is not Palindrome");

    }//end main
}
