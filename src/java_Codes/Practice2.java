package java_Codes;

public class Practice2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c ;
        for(int i=0; i<7;i++){
            c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }

    }
}
