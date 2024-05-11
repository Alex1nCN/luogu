package p1089;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int money=0;
        int waste=0;
        int bank=0;
        int i=0;
        for(i=0;i<12;i++){
            waste=in.nextInt();
            money+=300;
            if(money<waste) {
                System.out.println(-(i + 1));
                break;
            }else{
                money-=waste;
            }
            bank=bank+(money/100)*100;
            money=money%100;
        }
        if(i==12){
            System.out.println(Math.round(bank*1.2+money));
        }
    }
}
