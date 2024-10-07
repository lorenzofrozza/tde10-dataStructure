package Stack.ex01;
import Stack.ex03.GenericStack;

import java.util.Scanner;


public class EvenOdd {
    public static void main(String[] args) {
        GenericStack<Integer> even = new GenericStack<>();
        GenericStack<Integer> odd = new GenericStack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            int number = scanner.nextInt();

            if (number == 0) {
                if (even.isEmpty() || odd.isEmpty()) {
                    System.out.println("The stacks are empty");
                }
                even.pop();
                odd.pop();
            }
            if (number % 2 == 0){
                even.push(number);
            } else {
                odd.push(number);
            }
        }
        System.out.println(even);
        System.out.println(odd);

        System.out.println("Popping elements from the even stack:");
        while (!even.isEmpty()) {
            System.out.println(even.pop());
        }

        System.out.println("Popping elements from the odd stack:");
        while (!odd.isEmpty()) {
            System.out.println(odd.pop());
        }

        scanner.close();
    }
}
