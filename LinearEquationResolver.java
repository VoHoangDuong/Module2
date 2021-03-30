import java.util.Scanner;
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Phương trình bậc nhất có dạng 'a * x + b = c', vui lòng");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị a : ");
        double a = scanner.nextDouble();

        System.out.println("Nhập giá trị b :");
        double b = scanner.nextDouble();

        System.out.println("Nhập giá trị c :");
        double c = scanner.nextDouble();
        if(a == 0){
            System.out.println("Phương trình vô nghiệm");
        }else {
            double value = (c-b)/a;
            System.out.println("Phương trình có 1 nghiệm là : " + value);
        }
    }
}
