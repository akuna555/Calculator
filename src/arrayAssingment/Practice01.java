package arrayAssingment;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Practice01 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("Please enter a sentence to be analyzed: ");
        String sentence = scan.nextLine();
        countWord(sentence);
    }
    public static void countWord(String str){
        String [] split = str.split(" ");
        String splitArr = Arrays.toString(split);
        int numberOfWords = split.length;
        System.out.println("The value of the split is as followed: "+ splitArr);
        System.out.println("The number of the words in this sentence: " + split.length);
    }
}
