package Proje11;

import java.util.Scanner;

public class OtobusBiletFiyatiHesaplama {

    public static void main(String[] args) {


       //Java ile mesafeye ve durumlara göre otobüs bileti fiyatı hesaplayan programı yapın.
        // Kullanıcıdan Mesafe (KM), yaş ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgileri ile mesafe başına ücret 0,10 TL / km olarak alın.
        // İlk olarak yolculuğun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        double km = input.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        double age = input.nextDouble();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        int number = input.nextInt();

        double tekYonUcreti = km*0.10;

        double gidisDonusYonUcreti = (2*km*0.10)-(2*km*0.10)/5;

        if (number==1 && km>0 && age>0){
            if (age<12){
                System.out.println("Toplam Tutar = " + (tekYonUcreti/2));
            }else if (age<24){
                System.out.println("Toplam Tutar = " + (tekYonUcreti-tekYonUcreti/10));
            }else if (age<=65){
                System.out.println("Toplam Tutar = " + (tekYonUcreti));
            }else if (age>65){
                System.out.println("Toplam Tutar = " + (tekYonUcreti));
                }
            else{
                System.out.println("Hatalı Veri Girdiniz !");
            }
        } else if (number==2 && km>0 && age>0) {
            if (age<12){
                System.out.println("Toplam Tutar = " + (gidisDonusYonUcreti/2));
            }else if (age<24){
                System.out.println("Toplam Tutar = " + (gidisDonusYonUcreti-gidisDonusYonUcreti/10));
            }else if (age<=65){
                System.out.println("Toplam Tutar = " + (gidisDonusYonUcreti-gidisDonusYonUcreti/30));
            }else if (age>65){
                System.out.println("Toplam Tutar = " + (gidisDonusYonUcreti));
            }else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }else {
                System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}
