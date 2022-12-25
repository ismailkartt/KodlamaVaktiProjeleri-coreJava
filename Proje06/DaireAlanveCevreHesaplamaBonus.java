package Proje06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DaireAlanveCevreHesaplamaBonus {
    public static void main(String[] args) {
        //Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Daire Alan Formülü : π * r * r
        //
        //Daire Çevre Formülü : 2 * π * r

        Scanner input = new Scanner(System.in);

        DecimalFormat numberFormat = new DecimalFormat("###,##0.00");

        System.out.print("Yarı çap değerini giriniz : ");
        double r = input.nextDouble();

        double CircleArea = Math.PI*r*r;
        System.out.println("Circle Area = " + numberFormat.format(CircleArea));

        double circleCircumference = 2*Math.PI*r;
        System.out.println("circleCircumference = "+numberFormat.format(circleCircumference));

        //Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
        //
        //π Sayısını = 3,14 alın.
        //
        //Formül : (π  * (r*r) *a) / 360)

        System.out.print("Enter center angle measure = ");
        double centerAngle = input.nextDouble();

        double circleZoneArea = ((3.14*(r*r)*centerAngle)/360);
        System.out.println("circleZoneArea = " + numberFormat.format(circleZoneArea));


    }
}
