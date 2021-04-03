import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Chuyển đổi từ C sang F");
        System.out.println("2. Chuyển đổi từ F sang C");
        System.out.println("Xin mời lựa chọn : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                tuCsangF();
                break;
            case 2 :
                TuFsangC();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    public static void tuCsangF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ C : ");
        double giatriC = scanner.nextDouble();
//        double giatriF = (9.0 / 5)*giatriC + 32;
        System.out.println("Nhiệt độ sau khi chuyển là " + ((9.0 / 5)*giatriC + 32) + "  độ F" );

    }
    public static void TuFsangC(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào giá trị F : ");
        double giatriF = scanner.nextDouble();
        System.out.println("Nhiệt độ sau khi chuyển là " +(5.0/9)*(giatriF - 32 ) + " độ C");
    }
}
