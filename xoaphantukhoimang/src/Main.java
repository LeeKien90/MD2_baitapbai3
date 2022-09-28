
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //xóa phần tử trong mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập giá trị phần tử tứ %d:", (i + 1));
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng trước khi xóa");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t", arrInt[i]);
        }
        System.out.println();

        System.out.println("nhập vào chỉ số phần tử cần xóa:");
        int index = Integer.parseInt(sc.nextLine());
        int[] arrIntNew = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < index) {
                arrIntNew[i] = arrInt[i];
            } else if (i == index) {
                continue;
            } else {
                arrIntNew[i - 1] = arrInt[i];
            }
        }

        System.out.println("Mảng sau khi xóa");
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d\t", arrIntNew[i]);
        }
    }
}
