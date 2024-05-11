package p1115;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long res=0;
        long max=-99999;
        for(int i=1;i<n+1;i++){
            int x=in.nextInt();
            res=res+x;
            if(res<x){
                res=x;
            }
            max=Math.max(res,max);
        }
        System.out.println(max);
    }
}
