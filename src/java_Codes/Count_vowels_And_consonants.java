package java_Codes;

public class Count_vowels_And_consonants {
    public static void main(String[] args) {
        String line ="This website is aw#som3 .";
        int vowels=0; int cons=0;
        int digit =0; int space =0;
        line =line.toLowerCase();
        for(int i=0; i < line.length();i++){
            char ch = line.charAt(i);
            if(ch =='a'||ch=='e'||ch=='i'|| ch=='o'|| ch == 'u'){
                vowels++;
            }else if(ch >='a'&& ch <='z'){
                cons++;
            }else if(ch>='0'&& ch<='9'){
                digit++;
            }else if(ch==' '){
                space++;
            }
        }
        System.out.println("Vowels: "+ vowels);
        System.out.println("Cons: "+ cons);
        System.out.println("Digits: "+ digit);
        System.out.println("Spaces : "+ space);
    }
}
