package pri.hq.javase.ch2;

import java.util.Scanner;

public class forDemo2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入金字塔的层数：");
        int n =sc.nextInt();
        int j,k,i;
        for(i=1;i<n;i++)
        {
            for(j=1;j<n-i;j++)
                System.out.println(" ");
            for(k=1;k<2*i-1;k++)
                System.out.println();

        }
    }
}
