package loops;

public class Task {

	public static void main(String[] args) {

        // Question 1: Print numbers from 1 to 10.
        System.out.println("\n1. Numbers from 1 to 10:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Question 2: Find the sum of first n natural numbers.
        System.out.println("\n2. Sum of first n natural numbers:");
        int n = 10, sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);

        // Question 3: Print multiplication table of a number.
        System.out.println("\n3. Multiplication Table:");
        int num = 5;

        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // Question 4: Find the factorial of a number.
        System.out.println("\n4. Factorial:");
        int number = 5, fact = 1;

        for(int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);

        // Question 5: Print all even numbers between 1 and 50.
        System.out.println("\n5. Even Numbers:");
        for(int i = 1; i <= 50; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Question 6: Count the vowels in a String.
        System.out.println("\n6. Count Vowels:");
        String s = "Education";
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels = " + count);

        // Question 7: Print each character of a String on a new line.
        System.out.println("\n7. Print Each Character:");
        String str = "Java";

        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // Question 8: Find sum and average of array elements.
        System.out.println("\n8. Sum and Average:");
        int a[] = {10, 20, 30, 40, 50};
        int total = 0;

        for(int i = 0; i < a.length; i++) {
            total = total + a[i];
        }

        double avg = (double) total / a.length;

        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);

        // Question 9: Print squares of numbers from 1 to 10.
        System.out.println("\n9. Squares:");
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + " Square = " + (i * i));
        }

        // Question 10: Reverse a String using a for loop.
        System.out.println("\n10. Reverse a String:");
        String word = "Hello";
        String rev = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println("Reverse = " + rev);

        // Question 11: Count positive and negative numbers in an array.
        System.out.println("\n11. Positive and Negative Numbers:");
        int arr[] = {10, -5, 20, -8, 30};
        int positive = 0, negative = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                positive++;
            }
            else if(arr[i] < 0) {
                negative++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);

        // Question 12: Find the largest element in an array.
        System.out.println("\n12. Largest Element:");
        int b[] = {10, 50, 20, 80, 30};
        int largest = b[0];

        for(int i = 1; i < b.length; i++) {
            if(b[i] > largest) {
                largest = b[i];
            }
        }
        System.out.println("Largest = " + largest);

        // Question 13: Print numbers from 10 down to 1.
        System.out.println("\n13. Reverse Counting:");
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Question 14: Find sum of odd numbers between 1 and 100.
        System.out.println("\n14. Sum of Odd Numbers:");
        int oddSum = 0;

        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {
                oddSum = oddSum + i;
            }
        }
        System.out.println("Odd Sum = " + oddSum);

        // Question 15: Print the first n Fibonacci numbers.
        System.out.println("\n15. Fibonacci Series:");
        int x = 0, y = 1, z;

        for(int i = 1; i <= 10; i++) {
            System.out.print(x + " ");

            z = x + y;
            x = y;
            y = z;
        }

    }

	}


