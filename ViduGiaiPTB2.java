public class ViduGiaiPTB2 {
    public static void main(String[] args) {
        GiaiPhuongTrinhBacHai gpt2 = new GiaiPhuongTrinhBacHai(4,10,6);
        if (gpt2.delta() < 0){
            System.out.println("Phương trình vô nghiệm ");
        }else if (gpt2.delta() == 0){
            System.out.println("Phương trình có nghiệm kép là x1 = " + " x2 = " + gpt2.nghiemkep());
        }else {
            System.out.println("Phương trình có 2 nghiệm phân biệt là x1 = " + gpt2.nghiemx1() + " và x2 = " + gpt2.nghiemx2());
        }
    }
}
