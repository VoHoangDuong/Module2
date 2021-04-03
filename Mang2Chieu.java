import java.util.Scanner;
public class Mang2Chieu {
    public static void main(String[] args) {
        int[][] array = GetArray();
        System.out.println("Mảng vừa tạo gồm các phần tử ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int max = getMaxInArray(array);
        System.out.println("Giá trị lớn nhất trong mảng là " + max);
        
    }
    public static int[][] GetArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào size1 : ");
        int size1 = scanner.nextInt();
        System.out.println("Nhập vào size2 : ");
        int size2 = scanner.nextInt();
        int[][] array = new int [size1][size2];
        for (int i = 0; i < size1; i++){
            for (int j = 0 ; j < size2; j++){
                array[i][j] = (int) (Math.random()*20+5);
            }
        }
        return array;
    }
    public static int getMaxInArray(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
