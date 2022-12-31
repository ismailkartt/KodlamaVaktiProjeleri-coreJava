package Proje22;

import java.util.Scanner;

public class UcgenYapimi {

    public static void main(String[] args) {

        //Java ile kullanıcı girdiği değer kadar yıldızlar ile eşkenar üçgen oluşturan programı yazın.
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        //***********

        Scanner input = new Scanner(System.in);
        System.out.print("Satir sayisini giriniz : ");
        int n = input.nextInt();

        for (int i=1; i<=n; i++){
            for (int k=1; k<=(n-i); k++){
                System.out.print(" ");
            }for (int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }









    }
}
