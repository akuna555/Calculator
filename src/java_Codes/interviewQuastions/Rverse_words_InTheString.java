package java_Codes.interviewQuastions;

public class Rverse_words_InTheString {
    public static void main(String[] args) {
        //My name is Oksana
        String str= " My name is Oksana";
        String str1 = "";
        String [] ch = str.split(" ");
        for(int i=0; i<ch.length;i++){
            System.out.print(ch[i]+ " ");
        }
        System.out.println();
        for(int j=ch.length-1;j>=0;j--) {
            str1 = str1 + ch[j] + " ";
        }
            System.out.print(str1);


    }
}
