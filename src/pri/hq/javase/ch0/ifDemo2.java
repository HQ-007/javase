package pri.hq.javase.ch0;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class ifDemo2 {
    public static void main(String[] args) {
        int fare=100;
        System.out.println("请输入订票的时间：");
        Scanner scanner=new Scanner(System.in);
        double time=scanner.nextDouble();
        System.out.println("time="+time);

        if(time>=1.01&&time<=1.03)
        {
            System.out.println("无优惠,fare="+fare);
        }
        else if(time>=5.01&&time<=5.03)
        {
            System.out.println("无优惠,fare="+fare);
        }
        else if(time>=10.01&&time<=10.07)
        {
            System.out.println("无优惠,fare="+fare);
        }
        else
        {
            fare*=0.8;
            System.out.println("打八折,fare="+fare);
        }
    }
}
