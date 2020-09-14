package pri.hq.javase.ch0;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入性别  0:男, 1:女 ");
        int sex=sc.nextInt();

        System.out.println("请输入身高：");
        float high=sc.nextFloat();

        System.out.println("请输入年纪：");
        int age=sc.nextInt();


        if(sex==0&&high>170&&age>=20&&age<=22)
        {
            System.out.println("可以入伍！");
        }
        else if(sex==1&&high>162&&age>=20&&age<=22)
        {
            System.out.println("可以入伍！");
        }
        else{
            System.out.println("不能入伍！");

        }
    }
}
