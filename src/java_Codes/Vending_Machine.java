package java_Codes;

import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        double money =0.0;
        money = acceptMoney();
        if(isMoneyEnough(money)){
            dispenseCoffe();
        }else{
            notify("Money not enough");
        }
    }
    public static double acceptMoney(){
        Scanner input = new Scanner (System.in);
        double payAmount =0.0;
        System.out.println("Enter money: ");
        payAmount=input.nextDouble();
        return payAmount;
    }
    public static boolean isMoneyEnough(double  myMoney){
        if(myMoney>=1.5){
            return true;
        }else{
            return false;
        }

    }
    public static void dispenseCoffe() {

            System.out.println("Coffe is served");
        }
        public static void notify(String message) {
            System.out.println(message);
        }
        public static double issuChange(double payment){
        double change =0.0;
        change = payment -1.50;
        return change;
        }

    }