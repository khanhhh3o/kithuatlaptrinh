import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Nhap so nguyen duong n: ");
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i < n + 1; i++) {
            map.put(i, i * i);
        }
        System.out.println(map);
    }
}
