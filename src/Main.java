import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi;
        int total=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı Giriniz: ");
        sayi=input.nextInt();

        for (int i =1 ;i<sayi;i++ ) {
            if (sayi % i == 0) {
                total += i;
            }
        }
        if (total==sayi){
            System.out.println("mükemmel sayı");
        }
        else {
            System.out.println("Mükemmel sayı degil");
        }
    }
}