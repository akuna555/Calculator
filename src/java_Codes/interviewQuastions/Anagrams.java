package java_Codes.interviewQuastions;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 ="java";
        String str2 ="avaj";

        System.out.println("Bith string are anagrams -> "+  anagramCheck(str1,str2));
    }
  public static boolean  anagramCheck(String str1, String str2){
        char[] chArray = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
      Arrays.sort(chArray);
      Arrays.sort(charArray2);
        return Arrays.equals(chArray,charArray2);
  }
}
