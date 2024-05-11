package p1043;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int l=n/m;
        int max=-1;
        int min=9999;
        int[] data=new int[200];
        int[] prefix=new int[200];
        for(int i=1;i<n+1;i++){
            data[i]=in.nextInt();
            prefix[i]=prefix[i-1]+data[i];
        }
        for(int i=n+1;i<2*n+1;i++){
            prefix[i]=prefix[i-1]+data[i%(n+1)+1];
        }
        for(int i=1;i<n+1;i++){
            int cnt=0;
            int temp=1;
            for(int j=i;cnt<m;cnt++){
                temp=temp*Math.abs((prefix[j+l]-prefix[j])%10);
                j=j+l;
            }
            max=Math.max(temp,max);
            min=Math.min(temp,min);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
