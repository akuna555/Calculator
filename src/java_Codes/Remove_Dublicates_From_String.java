package java_Codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Dublicates_From_String {
    public static void main(String[] args) {
        String str= "ookkssaannii";
        StringBuilder build = new StringBuilder(str);
        Set<Character> rem = new LinkedHashSet<>();
        for(int i=0; i< str.length();i++){
            rem.add(str.charAt(i));
        }
        for(Character c: rem){
            build.append(c);
        }
        System.out.println(rem);
    }
}
