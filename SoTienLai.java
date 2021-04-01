import java.util.Scanner;
public class SoTienLai {
    public static void main(String[] args) {
        System.out.println("Tính tiền lãi");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số tiền gửi : ");
        double money = scanner.nextDouble();

        System.out.println("Nhập vào số tháng : ");
        int month = scanner.nextInt();

        System.out.println("Nhập vào lãi suất : ");
        double laisuat = scanner.nextDouble();

        double totalmoney = 0;

        for (int i = 1; i < month; i++){
            totalmoney = money * (laisuat/100)/12 * month;
        }
        System.out.println(" tổng số tiền là " + totalmoney);
    }
}
//public class SoTienLai {
//
//    public static void main(String[] args) {
//
//        double money = 1.0;
//        int month = 1;
//        double interset_rate = 1.0;
//
//        java.util.Scanner input = new java.util.Scanner(System.in);
//        System.out.println("Money: ");
//        money = input.nextDouble();
//        System.out.println("Time (month): ");
//        month = input.nextInt();
//        System.out.println("Interest rate: ");
//        interset_rate = input.nextDouble();
//
//        double total_interset = 0;
//        for (int i = 0; i < month; i++) {
//            total_interset = money * (interset_rate / 100) / 12 * month;
//        }
//
//        System.out.println("Total interset: " + total_interset);
//    }
//}
