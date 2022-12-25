package Proje06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DaireAlanveCevreHesaplama {
    public static void main(String[] args) {
        //Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Daire Alan Formülü : π * r * r
        //
        //Daire Çevre Formülü : 2 * π * r

        Scanner input = new Scanner(System.in);

        DecimalFormat sayiFormat = new DecimalFormat("###,##0.00");

        System.out.print("Yarı çap değerini giriniz : ");
        double r = input.nextDouble();

        double daireAlani = Math.PI*r*r;
        System.out.println("daireAlani = " + sayiFormat.format(daireAlani));

        double daireCevresi = 2*Math.PI*r;
        System.out.println("daireCevresi = "+sayiFormat.format(daireCevresi));

    }
}
