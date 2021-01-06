import java.util.Scanner;

import static javax.swing.text.html.HTML.Tag.S;

public class bai3 {
    public static void main(String[] args){
        int a;
        int b;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
         b = scanner.nextInt();
        if (a==0){
            if (b==0){
                System.out.println("Phuong trinh vo so nghiem");
            }else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }else {
            nghiem = (double)- b / a;
            System.out.println("Phuong trinh co nghiem x la: "+ nghiem);
        }

    }
}
