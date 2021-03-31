import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Chuyển đổi tiền USD sang VND");

        System.out.println("Nhập vào số USD : ");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
         int rate = 23000;
        System.out.println("Chuyển sang tiền việt :  " + money*rate + " VND");

    }
}
