import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int row = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("arr[%d][%d]=", i, j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mang moi la: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        int tongCheo=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i==j){
                    tongCheo+=arr[i][j];
                }
            }
        }System.out.println(" Tong gia tri cheo chinh la = "+tongCheo);
        int tongCheophu=0;
        for (int i=0;i<row; i++){
            for (int j = 0; j < row; j++) {
                if (i+j==row-1){
                    tongCheophu+=arr[i][j];
                }
            }
        }System.out.println(" Tong gia tri cheo phu la = "+tongCheophu);

    }
}