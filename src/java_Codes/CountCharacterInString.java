package java_Codes;

public class CountCharacterInString {
    public static void main(String[] args) {
        String str= " Okasanaa";
        char ch1 ='a';
        int count=0;
        char [] ch = str.toCharArray();
        for(int i=0; i< ch.length;i++){
            if(ch[i]==ch1){
                count++;


            }}
            System.out.println(" A appears "+count+ " times");
        }
    }

