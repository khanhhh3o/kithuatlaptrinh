

import java.util.Scanner;

public class bai6 {
    static boolean KTSCP(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số cần kiểm tra:");
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        s.close();
        if (KTSCP(n))
            System.out.println(n+ " Là số chính phương");
        else
            System.out.println(n+ " Không phải là số chính phương");
    }
}

