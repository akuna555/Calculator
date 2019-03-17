package java_Codes;

public class If_Contains_another_String {
    public static void main(String[] args) {
        String str = "Oksana";
        String str1 = "Okl";
        if(str.contains(str1)){
            System.out.println("Contains");
        }else{
            System.out.println("Does not contsins");
        }
    }
}
