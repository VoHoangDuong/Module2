import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
    int[] array_1 = array1();
    System.out.println("Mảng thứ nhất gồm các phần tử ");
    for (int i = 0; i < array_1.length; i++){
        System.out.print(array_1[i] + " ");
    }
        System.out.println(" ");
    int[] array_2  = array2();
        System.out.println("Mảng thứ hai gồm các phần tử ");
        for (int i = 0; i < array_2.length; i++){
            System.out.print(array_2[i] + " ");
        }
        System.out.println(" ");
    System.out.println("Các phàn tử trong mảng thứ 3 là ");
    int[] array_3 = new int[array_1.length+array_2.length];
    for (int i = 0; i < array_1.length;i++){
        array_3[i] = array_1[i];
        System.out.print(array_3[i] + " ");
        }
    for (int j = 0; j < array_2.length;j++){
        array_3[j] = array_2[j];
        System.out.print(array_3[j] + " ");
    }
    }
    public static int[] array1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size1 : ");
        int size1 = scanner.nextInt();
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++){
            array[i] = (int) (Math.random()*30);
        }
        return array;
    }
    public static int[] array2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size2 : ");
        int size2 = scanner.nextInt();
        int[] array = new int[size2];
        for (int i = 0; i < size2; i++){
            array[i] = (int) (Math.random()*20);
        }
        return array;
    }
}
