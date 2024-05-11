package p1161;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        boolean[] f=new boolean[1000001];
        long max=0;
        for(int i=0;i<n;i++){
            double m=in.nextDouble();
            int t=in.nextInt();
            max=Math.max(max,Math.round(t*m));
            for(int j=1;j<t+1;j++){
                if(f[(int)(m*j)]){
                    f[(int)(m*j)]=false;
                }else{
                    f[(int)(m*j)]=true;
                }
            }
        }
        for(int i=1;i<max+1;i++){
            if(f[i]){
                System.out.println(i);
                break;
            }
        }
    }
}

