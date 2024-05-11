package p1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean valid=false;
        int k=in.nextInt();
        for(int i=100;i<300;i++){
            if(i%k==0){
                for(int j=i%100*10;j<(i%100*10)+10;j++){
                    if(j%k==0){
                        for(int m=j%100*10;m<(j%100*10)+10;m++){
                            if(m%k==0){
                                System.out.println(i*100+j%10*10+m%10);
                                valid=true;
                            }
                        }
                    }
                }
            }
        }
        if(300%k==0){
            System.out.println(30000);
            valid=true;
        }
        if(!valid){
            System.out.println("No");
        }
    }
}
