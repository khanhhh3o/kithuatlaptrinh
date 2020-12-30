import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ " + i + " ");
            a[i] = sc.nextInt();
        }
        System.out.print("Tổng phần tử đầu tiên và cuối là: " + (a[0] + a[n - 1]));
    }
}
