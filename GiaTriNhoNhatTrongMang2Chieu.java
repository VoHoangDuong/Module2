import java.util.Scanner;
public class GiaTriNhoNhatTrongMang2Chieu {
    public static void main(String[] args) {
    int [][] array = GetArray();
        System.out.println("Mảng vừa được tạo là ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0 ; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int min = Min(array);
        System.out.println("Giá trị nhỏ nhất trong mảng là " + min);
    }
    public static int[][] GetArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị size_1 : ");
        int size_1 = scanner.nextInt();
        System.out.println("Nhập vào giá trị size_2 : ");
        int size_2 = scanner.nextInt();
        int[][] array = new int[size_1][size_2];
        for (int i = 0; i < size_1; i++){
            for (int j = 0; j < size_2; j++){
                array[i][j] = (int) (Math.random()*20 + 10);
            }
        }
        return array;
    }
    public static int Min(int[][] array){
        int min = array[0][0];
        for (int i = 0 ; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
