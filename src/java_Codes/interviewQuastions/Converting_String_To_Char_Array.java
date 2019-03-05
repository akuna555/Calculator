package java_Codes.interviewQuastions;

public class Converting_String_To_Char_Array {
    public static void main(String[] args) {
        String str= "Oksana";
        char [] ch =str.toCharArray();
        for(char c  : ch){
            System.out.println(c);
        }
        System.out.println("================");
        for(int i=0; i<ch.length;i++){
            System.out.print(ch[i]+ " ");
        }
    }
}
