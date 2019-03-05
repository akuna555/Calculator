package java_Codes.interviewQuastions;

import java.util.Scanner;

public class Sum_OfNumbers_With_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter yours numbers: ");
        int num =scan.nextInt();
        int num2 =scan.nextInt();
        int sum = num+num2;
        System.out.println("Sum is : "+ sum);
    }
}
