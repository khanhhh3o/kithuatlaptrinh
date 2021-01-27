import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (int i = 10; i <= 201; i++) {
            if ((i % 7 == 0) && (i % 5 != 0)) {
                a++;
            }
        }


    }
}

