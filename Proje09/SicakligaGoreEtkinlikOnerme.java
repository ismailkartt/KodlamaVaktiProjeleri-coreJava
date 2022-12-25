package Proje09;

import java.util.Scanner;

public class SicakligaGoreEtkinlikOnerme {

    public static void main(String[] args) {

        //Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
        //Sıcaklık 5 ve 15 arasında ise "Tiyatro" etkinliğini öner.
        //Sıcaklık 15 ve 25 arasında ise "Mangal" etkinliğini öner.
        //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the desired temperature value = ");
        short temperature = input.nextShort();

        String event = "";

        if (temperature<5){
            event = "You can ski";
        }else if (temperature<15){
            event = "You can go to the theater";
        }else if (temperature<25){
            event = "You can barbecue";
        }else {
            event = "You can swim";
        }
        System.out.println("Recommended activity = " + event);







    }

}
