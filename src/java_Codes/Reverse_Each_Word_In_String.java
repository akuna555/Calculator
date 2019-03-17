package java_Codes;

public class Reverse_Each_Word_In_String {
    public void reverseInMyString(String str){
        String [] words =str.split(" ");
        String reverseString="";
        for(int i=0; i< words.length;i++){
            String word = words[i];
            String reverseWord="";
            for(int j= word.length()-1;j>=0;j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
                reverseString+=reverseWord+ " ";
            }
            System.out.println(str);
            System.out.println(reverseString);

        }
        public static void main (String[] args){
        Reverse_Each_Word_In_String obj =  new Reverse_Each_Word_In_String();
        obj.reverseInMyString("Welcome to BeginnersBook");


        }

    }

