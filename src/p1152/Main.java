package p1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        boolean[] f=new boolean[n+1];
        long[] nums=new long[n+1];
        for(int i=1;i<n+1;i++){
            nums[i]=in.nextLong();
        }
        for(int j=1;j<n;j++){
            try{
                f[Math.abs((int)(nums[j]-nums[j+1]))]=true;
            }catch(Exception e){
                continue;
            }
        }
        int cnt=0;
        for(int i=1;i<n;i++){
            if(f[i]==true){
                cnt++;
            }else{
                break;
            }
        }
        if(cnt==n-1){
            System.out.println("Jolly");
        }else{
            System.out.println("Not jolly");
        }
    }
}
