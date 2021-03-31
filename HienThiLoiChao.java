import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("HIển thị lời chào");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào tên : ");
        String name = scanner.nextLine();

        System.out.println("Hello : " + name);
    }
}
