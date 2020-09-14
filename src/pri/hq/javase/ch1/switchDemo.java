package pri.hq.javase.ch1;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class switchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学员的成绩：");
        int score=sc.nextInt();
        switch(score)
        {
            case 100:
                System.out.println("学生成绩等级为:A");
                break;
            case 90:
                System.out.println("学生成绩等级为:A");
            default:
                break;
        }
    }
}
