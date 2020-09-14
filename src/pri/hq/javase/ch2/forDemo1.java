package pri.hq.javase.ch2;

import java.util.Scanner;

public class forDemo1 {
    public static void main(String[] args) {
        int num =(int)Math.random()*100+1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n=sc.nextInt();
        for(int i=1;i<7;i++)
        {
            if(n<num)
            {
                System.out.println("太小了，在大一点");
                n=sc.nextInt();
            }
            else if(n>num)
            {
                System.out.println("太大了，再小一点");
                n=sc.nextInt();
            }

            else if(n==num)
            {
                System.out.println("恭喜你，猜对了");
            }
        }
        System.out.println("你太笨了，下次再来吧！");
    }
}
