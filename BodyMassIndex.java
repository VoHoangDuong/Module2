import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số cân nặng của cơ thể");
         Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào cân nặng : ");
        double weigth = scanner.nextDouble();

        System.out.println("Nhập vào chiều cao : ");
        double heigth = scanner.nextDouble();

        double bmi = weigth/(heigth*heigth);

        if (bmi >= 30){
            System.out.println("Obese");
        }else if (bmi >= 25){
            System.out.println("Overweight");
        }else if (bmi >= 18.5){
            System.out.println("Normal");
        }else {
            System.out.println("Underweight");
        }
    }
}
