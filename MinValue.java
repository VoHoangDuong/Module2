import java.util.Scanner;
public class MinValue {
    public static void main(String[] args) {
        int[] arr = getarray();
        System.out.println("Mảng được tạo gồm các phần tử ");
        printArray(arr);
        System.out.println(" ");
        System.out.println("Giá trị nhỏ nhất trong mảng là " + Min(arr));
    }
    public static int[] getarray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random()*20+5);
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int Min(int[] array){
        int min = array[0];
        for (int i = 0 ; i < array.length; i++){
            if(min > array[i]){
                min  = array[i];
            }
        }
        return min;
    }
}
