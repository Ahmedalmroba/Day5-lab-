import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        two numbers , takes two numbers as input */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        double sum = number1 + number2;
        double subtract = number1 - number2;
        double product = number1 * number2;
        double divide = number1 / number2;
        double remainder = number1 % number2;

        System.out.println("Sum: " + sum);
        System.out.println("subtract: " + subtract);
        System.out.println("Product: " + product);
        System.out.println("divide: " + divide);
        System.out.println("Remainder: " + remainder);

       /*2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
       Test Data:*/
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiplication Table  " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);}
        /* 3. Write a Java program to print the area and perimeter of a circle.*/
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = 3.14159 * radius * radius;
        double perimeter = 2 * 3.14159 * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
       /*4. Java program to find out the average of a set of integers*/

        System.out.print("Enter the number of elements: ");
        int count = input.nextInt();
        System.out.println("Enter the elements:");
        int sum1 = 0;
        for (int i = 0; i < count; i++) {
            int num = input.nextInt();
            sum1 += num;
        }
        double average = (double) sum1 / count;

        System.out.println("Average: " + average);
      /*5. Write a Java program that accepts three integers as input, adds the first two integers
       together, and then determines whether the sum is equal to the third integer.*/
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = input.nextInt();

        int sum2 = num1 + num2;

        if (sum2 == num3) {
            System.out.println("The sum of the first two integers is equal to the third integer.");
        } else {
            System.out.println("The sum of the first two integers is not equal to the third integer.");
        }

       /* 6. Write a Java program to reverse a word.*/
        System.out.print("Enter a word: ");
        String word = input.next();

        String reversed_word = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed_word += word.charAt(i);
        }

        System.out.println("Reversed word: " + reversed_word);

       /* 7 - Java program to check whether the given number is even or odd*/
        System.out.print("Enter a number to check even or ood: ");
        int number3 = input.nextInt();

        if (number3 % 2 == 0) {
            System.out.println(number3 + " is even.");
        } else {
            System.out.println(number3 + " is odd.");

           /* 8 - Java program to convert the temperature in Centigrade to Fahrenheit*/

            System.out.print("Enter the temperature in Centigrade: ");
            double Centigrade = input.nextDouble();

            double fahrenheit = (Centigrade * 9 / 5) + 32;

            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            /*9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index.*/
            System.out.print("Enter a string: ");
            String inputString = input.next();

            System.out.print("Enter the index: ");
            int index = input.nextInt();

            if (index >= 0 && index < inputString.length()) {
                char character = inputString.charAt(index);
                System.out.println("Character at index " + index + ": " + character);
            } else {
                System.out.println("Invalid .");
            }

           /* 10. Write a Java program to print the area and perimeter of a rectangle.*/
            System.out.print("Enter the width of the rectangle: ");
            double width = input.nextDouble();

            System.out.print("Enter the height of the rectangle: ");
            double height = input.nextDouble();

            double area1 = width * height;
            double perimeter1 = 2 * (width + height);

            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);

            /*11. Write a Java program to compare two numbers.*/
            System.out.print("Input first integer: ");
            int number4 = input.nextInt();

            System.out.print("Input second integer: ");
            int number5 = input.nextInt();

            if (number4 != number5) {
                System.out.println(number4 + " != " + number5);
            }
            if (number4 < number5) {
                System.out.println(number4 + " < " + number5);
            }
            if (number4 <= number5) {
                System.out.println(number4 + " <= " + number5);
            }
            /*12. Write a Java program to convert seconds to hours, minutes and seconds.*/
              System.out.print("Enter the number of seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = (seconds % 3600) % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + remainingSeconds);

        /*13. Write a Java program that accepts four integers from the user and prints equal if all
        four are equal, and not equal otherwise*/
            System.out.print("Enter the first integer: ");
            int number6 = input.nextInt();

            System.out.print("Enter the second integer: ");
            int number7 = input.nextInt();

            System.out.print("Enter the third integer: ");
            int number8 = input.nextInt();

            System.out.print("Enter the fourth integer: ");
            int number9 = input.nextInt();

            if (number6 == number7 && number7 == number8 && number8 == number9) {
                System.out.println("Aer Equal");
            } else {
                System.out.println("Are not Equal");
            }
          /*  14. Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.*/
            System.out.print("Enter an integer: ");
            int number10 = input.nextInt();

            if (number10 < 0) {
                System.out.println("The number is negative.");
            } else if (number10 == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
         /*15.Write a program to enter the numbers till the user wants and at the end it should
          display the count of positive, negative and zeros entered
          (End loop use -1 , Don’t count -1)*/
                int positiveCount = 0;
                int negativeCount = 0;
                int zeroCount = 0;

                System.out.println("Enter numbers (Enter -1 to end the input):");

                int number11 = input.nextInt();
                while (number11 != -1) {
                    if (number11 > 0) {
                        positiveCount++;
                    } else if (number11 < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                    number11 = input.nextInt();
                }
                System.out.println("Positive numbers count: " + positiveCount);
                System.out.println("Negative numbers count: " + negativeCount);
                System.out.println("Zero numbers count: " + zeroCount);
                /*
                16 - Write a program that prompts the user to input an integer and then outputs the
                 number with the digits reversed
                 */
                System.out.print("Enter an integer: ");
                int number12 = input.nextInt();

                int reversedNumber = 0;
                while (number12 != 0) {
                    int digit = number12 % 10;
                    reversedNumber = reversedNumber * 10 + digit;
                    number12 /= 10;
                }
                System.out.println("Reversed number: " + reversedNumber);

                /*17 - Write a program to enter the numbers till the user wants and at the end the program
                should display the largest and smallest numbers entered.
                 */
                int largestNumber = Integer.MIN_VALUE;
                int smallestNumber = Integer.MAX_VALUE;

                System.out.println("Enter numbers (Enter -1 to end the input):");

                int number14 = input.nextInt();
                while (number14 != -1) {
                    if (number > largestNumber) {
                        largestNumber = number14;
                    }
                    if (number < smallestNumber) {
                        smallestNumber = number14;
                    }
                    number14 = input.nextInt();
                }

                System.out.println("Largest number: " + largestNumber);
                System.out.println("Smallest number: " + smallestNumber);

                /*18 - Determine and print the number of times the character ‘a’ appears in the input
                entered by the user.*/

                System.out.print("Enter a string: ");
                String inp = input.next();
                int con = 0;
                for (int i = 0; i < inp.length(); i++) {
                    if (inp.charAt(i) == 'a') {
                        con++;
                    }
                }
                System.out.println("Number of occurrences of 'a': " + con);
            }}}}

