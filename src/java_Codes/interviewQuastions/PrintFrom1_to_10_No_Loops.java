package java_Codes.interviewQuastions;

public class PrintFrom1_to_10_No_Loops {
    public static void main(String[] args) {
        printNumber(1);
    }
    public static void printNumber(int n){
        if(n<=10){
            System.out.println(n);
            printNumber(n+1);
        }
    }
}
