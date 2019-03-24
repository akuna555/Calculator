package java_Codes.interviewQuastions;

public class Frequency_Of_each_Word {
    public static void main(String[] args) {
        String str = "okasanaso";
        char[] ch = str.toCharArray();
        for(int i=0; i< ch.length;i++) {
            int index = i;
            int count = 0;
            for(int j=0; j<ch.length;j++){
                if(j<i && (ch[i]==ch[j])){
                    break;
                }
                if(ch[index]== ch[j]){
                    count++;
                } }
                if(count>0){
                    System.out.println(ch[i]+ " is "+ count + " times");
                }
        }

    }
}
