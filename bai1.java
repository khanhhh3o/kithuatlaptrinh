import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        int a;
        Scanner sc= new Scanner(System.in);
        a = sc.nextInt();
        int[] array = new int[a];
        for (int i = 0;i < a;i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("\nMang ban dau: ");
        for (int i = 0;i < a;i++){
            System.out.print(array[i] + "\t");
        }
        for (int i = 0;i < a;i++){
            if (array[i] % 2 == 1){
                System.out.println("Cac so le la: \n" + array[i]);
            }
        }
    }
}
