import java.util.Scanner;
public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
    int[] arr = getArray();
        System.out.println("Mảng vừa được tạo gồm các phần tử");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        ChenPhanTu(arr);
    }
    public static int[] getArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random()*20);
        }
        return array;
    }

    public static void ChenPhanTu(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá cần chèn : ");
        int value = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn : ");
        int index = scanner.nextInt();
        if (index <= 1  && index >= arr.length-1){
            System.out.println("Không chèn được phần tử vào mảng ");
        }else {
            for (int i = 0; i < arr.length; i++){
                arr[index] = value;
            }
            System.out.println("Mảng mới gồm các phần tử ");
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
