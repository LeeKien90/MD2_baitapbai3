import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang 1: ");
        int lenght1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[lenght1];
        for (int i = 0; i < lenght1; i++) {
            System.out.println("Nhap phan tu arr" + "[" + i + "]: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Nhap do dai mang 2: ");
        int lenght2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[lenght2];
        for (int i = 0; i < lenght2; i++) {
            System.out.println("Nhap phan tu arr" + "[" + i + "]: ");
            arr2[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("============Mang 1 la=========== ");
        for (int i = 0; i < lenght1; i++) {
            System.out.print(arr1[i]+"  ");
        }System.out.println();
        System.out.println("************Mang 2 la************");
        for (int i = 0; i < lenght2; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
        int[] toTalArr=new int[lenght1+lenght2];
        System.out.println("------------mang moi la-----------");
        for (int i = 0; i < toTalArr.length; i++) {
            if (i<arr1.length){
                toTalArr[i]=arr1[i];
            }else {
                toTalArr[i]=arr2[i-arr1.length];
            }
            System.out.print(toTalArr[i]+ "  ");
        }
    }
}