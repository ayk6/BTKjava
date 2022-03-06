public class switchD {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("not A");
                break;
            case 'B':
                System.out.println("not B");
                break;
            case 'C':
                System.out.println("not C");
                break;
            case 'D':
                System.out.println("not D");
                break;
            case 'F':
                System.out.println("not F");
                break;
            default:
                System.out.println("geçersiz not");
        }
    }
}
