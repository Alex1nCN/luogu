package p4702;

import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;
        for(int i=1;i<n+1;i++){
            res=res+Math.floorMod(in.nextLong(),2);
            res=res%2;
        }
        if(res%2==1){
            System.out.println("Alice");
        }else {
            System.out.println("Bob");
        }
    }
}
