import java.util.Scanner;
public class GaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2");
        System.out.println("Phương trình bậc 2 có dạng ax^2 + bx + c = 0");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập giá trị a :");
        double a = scanner.nextDouble();

        System.out.println("Nhập giá trị b :");
        double b = scanner.nextDouble();

        System.out.println("Nhập giá trị c :");
        double c = scanner.nextDouble();

        double delta = (b*b) - (4*a*c);
        if(a == 0){
            System.out.println("Không phải phương trình bậc 2");
        } else if ( a!=0 && delta == 0){
            System.out.println("Phương trình có nghiệm kép : " + " x1 = x2 = " + (-b/(2*a)));
        }else if( a!=0 && delta > 0){
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
