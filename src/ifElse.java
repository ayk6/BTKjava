public class ifElse {
    public static void main(String[] args) {
        int num=10;
        if (num>5){
            System.out.println("sayı 5'ten büyük");}
        if (num>50){
            System.out.println("sayı 20'den küçük");}

        if (num<10){
            System.out.println("sayı 10'dan büyük");}
        else if (num<20){
            System.out.println("sayı 10'dan büyük değil ama 20'den küçük");
        }
        else System.out.println("diğer");
    }
}
