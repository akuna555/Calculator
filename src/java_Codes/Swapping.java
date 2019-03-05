package java_Codes;

public class Swapping {
    public static void main(String[] args) {
        int n= 10;
        int n2 = 40;
        int temp=0;
        System.out.println("Before swapping  n "+ n + " before swapping  n2"+ n2);
        n=n+n2;
        n2=n-n2;
        n=n-n2;
        System.out.println("After  n "+ n + " After n2 " + n2);
        int sum = n+ n2;
        System.out.println( "Sum is : "+ sum);
    }
}
