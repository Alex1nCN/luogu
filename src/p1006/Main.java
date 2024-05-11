package p1006;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int max=0;
        int day=0;
        for(int i=0;i<7;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            if((a+b)>max){
                day=i+1;
            }
            max=Math.max(max,a+b);
        }
        if(max<=8){
            System.out.println(0);
        }else{
            System.out.println(day);
        }
    }
}
