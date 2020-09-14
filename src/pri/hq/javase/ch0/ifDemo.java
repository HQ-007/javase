package pri.hq.javase.ch0;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ifDemo {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("a="+a);
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("b="+b);


        System.out.println("请输入一个运算符");
        String str=sc.next();
        if (str.equals("+"))
        {
            sum=a+b;
            System.out.println("a+b=" +sum);
        }
        else
        {
            System.out.println("运算符输入错误");
        }

    }
}
