package Stack.ex02;

import Stack.ex03.GenericStack;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        GenericStack<Character> palindrome = new GenericStack<Character>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character sequence to check if its a palindrome: ");
        String sequence = scanner.nextLine();
        String strippedString = sequence.replaceAll(" ", "");
//        System.out.println(strippedString);

        for (int i =0; i <strippedString.length(); i++){
            palindrome.push(strippedString.charAt(i));
        }
        String reverseSequence = "";

        while (!palindrome.isEmpty()){
            reverseSequence += palindrome.pop();
        }
//        System.out.println(reverseSequence);
//        if (sequence == reverseSequence){
//            System.out.println("It's a palindrome");
//        } else {
//            System.out.println("It's not a palindrome");
//        }
        System.out.println((strippedString.equals(reverseSequence)) ? "It's a palindrome" : "It's not a palindrome");




    }
}
