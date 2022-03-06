public class recapDemo1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 5;

        //en büyük sayıyı bul
        if (num1 > num2 && num1 > num3) {
            System.out.println("en büyük sayı num1");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("en büyük sayı num2");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("en büyük sayı num 3");
        } else System.out.println("diğer");
        ;
    }
}
