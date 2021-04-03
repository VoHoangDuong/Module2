import java.util.Scanner;
public class ValueMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng được tạo gồm các phần tử ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println(" ");
        System.out.println("Giá trị lớn nhất trong mảng là ");
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max = " + max);
    }
}