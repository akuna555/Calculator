package java_Codes.interviewQuastions;

public class DulicatesFromString {
    public static void main(String[] args) {
       String str=  new String("abbddcc");
       String str1= new String();
       for(int i=0; i<str.length();i++) {
           for (int j = 0; j < str1.length(); j++) {
               if (str.charAt(i) != str1.charAt(j)) {
                   str1 = str1 + str.charAt(i);
               }
           }
       }
        System.out.println(str1);
    }
}
