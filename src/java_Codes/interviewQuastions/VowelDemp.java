package java_Codes.interviewQuastions;

import java.util.Scanner;

public class VowelDemp {
    public static void main(String[] args) {
        System.out.println("Enter some string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int count =0;
        for(char c: chars){
            switch (c){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u':
                    count++;
                    break;
                    default:



            }
        }
        System.out.println("NUmber of vowels in string= "+ count);
    }
}
