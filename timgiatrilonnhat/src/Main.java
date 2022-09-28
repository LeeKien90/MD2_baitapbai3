import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hang: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so cot: ");
        int colum = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang moi la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int max=arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }

            }

        }System.out.println(" Phan tu lon nhat la :"+max);
    }
}