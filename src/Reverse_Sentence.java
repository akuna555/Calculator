public class Reverse_Sentence {
    public static void main(String[] args) {
        String str= "Oksana";
        String rev = "";
        for(int i=str.length()-1;i>=0;i-- ){
            rev = rev+str.charAt(i);

        }
        System.out.print(rev);
        System.out.println();

       System.out.println("==================================== ");
       String str2 = "lambada";
       StringBuilder bul = new StringBuilder(str2);
       StringBuilder reverse = bul.reverse();
        System.out.println(reverse);


    }}

