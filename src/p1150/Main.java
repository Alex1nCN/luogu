package p1150;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cigarette=in.nextInt();
        int left=0;
        int k= in.nextInt();
        int total=0;
        do{
            total+=cigarette;
            left=cigarette+left;
            cigarette=0;
            cigarette=cigarette+left/k;
            left=left%k;
        }while(cigarette!=0);
        System.out.println(total);
    }
}
