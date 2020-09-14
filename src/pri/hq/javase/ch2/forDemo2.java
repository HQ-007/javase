package pri.hq.javase.ch2;

import java.util.Scanner;

public class forDemo2 {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入金字塔层数：");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {

            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(k=1;k<=2*i-1;k++)
                System.out.printf("*");
            System.out.printf("\n");
        }


    }
}
