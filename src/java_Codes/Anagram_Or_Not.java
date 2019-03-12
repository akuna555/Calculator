package java_Codes;

import java.util.Arrays;

public class Anagram_Or_Not {
    public static void main(String[] args) {
        String str= "octovber";
        String str2 = "march";
        System.out.println(isAnagram(str,str2));
    }
    public static boolean isAnagram(String str, String str2){
        if(str.length()!=str2.length()){
            return false;
        }
        char [] ch = str.toCharArray();
        char [] ch2 =str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for(int i=0; i<str.length();i++){
            if(ch[i]==ch2[i]){
                return true;
            }
        }
        return false;


    }}

