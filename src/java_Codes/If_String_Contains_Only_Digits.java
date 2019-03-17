package java_Codes;

public class If_String_Contains_Only_Digits {
    public static boolean containsOnlyNumbers(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }}
            return true;
        }

    public static void main(String[] args){
        System.out.println(containsOnlyNumbers("12345"));
        System.out.println(containsOnlyNumbers("435ut6"));

        }
}
