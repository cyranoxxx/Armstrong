import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();
        int basamak=0,toplam=0;
        int gecici=sayi;
        int gecici_sayi=sayi;
        while(gecici>0){
            gecici/=10;
            basamak++;
        }
        while(gecici_sayi>0) {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            toplam += Math.pow(basamak_degeri,basamak);
            System.out.println("Basamak değeri="+basamak_degeri+" Basamak="+basamak+" Toplam=" + toplam);
        }
        if (sayi == toplam) {

            System.out.println(sayi+" sayısı bir armstrong sayıdır");
        }
        else {
            System.out.println(sayi+" sayısı bir armstrong sayı değildir");
        }
    }
}
