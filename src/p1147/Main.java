package p1147;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        for(int i=1;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=j;
                if(sum>n){
                    break;
                }
                if(sum==n){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
