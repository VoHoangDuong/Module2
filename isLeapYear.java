import java.util.Scanner;
public class isLeapYear {
    public static void main(String[] args) {
        System.out.println(" Kiểm tra năm nhuận  ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào năm cần kiểm tra : ");

        int year = scanner.nextInt();

        if (year % 4 == 0 ){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.println( year + " là năm nhuận");
                }else {
                    System.out.println(year + " không phải năm nhuận");
                }
            } else {
                System.out.println(year + " là năm nhuận");
            }
        }else {
            System.out.println( year + " không phải là năm nhuận");
        }
    }
}
