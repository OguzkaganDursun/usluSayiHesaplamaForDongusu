import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Degiskenler tanimlandi.
        int sayi, us, toplam = 1;

        //Kullanicidan veriler alindi ve hesaplanarak ekrana yazdirildi.
        Scanner scan = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayiyi Giriniz : ");
        sayi = scan.nextInt();

        System.out.print("Us Olacak Sayiyi Giriniz : ");
        us = scan.nextInt();

        for (int i = 1; i <= us; i++)
        {
            toplam *= sayi;
        }

        System.out.println("Islemin Sonucu : " + toplam);
    }
}
