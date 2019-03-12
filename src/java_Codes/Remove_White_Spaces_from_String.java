package java_Codes;

public class Remove_White_Spaces_from_String {
    public static void main(String[] args) {
        String myStr= "  I love   to study and   i love learn Java very     much   .";
        System.out.println(myStr.replaceAll("\\s",""));
    }
}
