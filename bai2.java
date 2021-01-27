import java.util.Scanner;

public class bai2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Nhap so nguyen duong n = ");
        System.out.println("Giai thua cua " + n + " la: " + tinhGiaithua(n));
    }
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
}
