import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = scanner.nextInt();
        if (a%2==0){
            System.out.println(a+ " La so chan!");
        } else {
            System.out.println(a+ " La so le!");
        }
    }
}
