public class Reverse_Sentence {
    public static void main(String[] args) {
        String str= "Java is a programming language";
        StringBuilder strBul = new StringBuilder(str);
        StringBuilder rev= strBul.reverse();
        System.out.println(rev);
        System.out.println("=========================");

        String sentence =" Java is a programming language";
        String reverse ="";
        for(int i=sentence.length()-1;i>=0;i--){
            reverse+=sentence.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("#####################################");
        String word ="lambada";
        StringBuilder bul = new StringBuilder(word);
        StringBuilder rev1 = bul.reverse();
        System.out.println(rev1);
        System.out.println("***************************");
        String word2= "Mama my Slava";


        }
    }

