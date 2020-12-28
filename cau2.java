import java.util.Scanner;

public class cau2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cho mang: ");
        int n = scanner.nextInt();
        int A[] = new int[n];
// y 1
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + " : ");
            A[i] = scanner.nextInt();
        }
        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        // ý 2
        int dem = 0;
        System.out.print("\nSố giá trị chia hết cho 5 mà không chia hết cho 6 là :" + dem);
        for (int i = 0; i < n; i++) {
            if (A[i] % 5 == 0) {
                if (A[i] % 6 != 0) {
                    dem++;
                }
            }
        }
        // ý 3
        int Dem = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                Dem++;
            }
        }
        System.out.println("\nSố các số le trong mảng là : " + Dem);
        // ý 4
        int tong = 0;
        int TB = 0;
        for (int i = 0; i < n; i++) {
            tong += A[i];
        }
        TB = tong / n;
        int em = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] >= TB) {
                em++;
            }
        }
        System.out.println("co " + em + " phần tử trong mảng A có giá trị lớn hơn hoặc bằng giá trị trung bình");
        // ý 5
        int d;
        int le[] = new int[n];
        d = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 != 0) {
                le[d] =A[i];
                d++;

            }
        }


        System.out.println("\nCác phần tử của mảng le là: " + d);
        for (int i = 0; i < d; i++) {
            System.out.print(le[i] + "\t");
        }
        // ý 6
        int a = 0;
        System.out.print("\nNhap so can kiem tra : ");
        int X = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                a++;
            }
        }
        if (a >= 2) {
            System.out.println("Co ton tai gia tri " + X + " lap lai trong mang.");
        } else {
            System.out.println("Khong ton tai gia tri " + X +" lap lai trong mang.");
        }
    }
}