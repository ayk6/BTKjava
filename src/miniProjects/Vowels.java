package miniProjects;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {

        char letter = 'i';

        switch (letter){
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("bold vowel");
                break;
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("thin vowel");
                break;
            default:
                System.out.println("invalid letter");
        }
    }
}
