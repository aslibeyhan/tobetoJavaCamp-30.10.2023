package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //İki sayı birbirinin kendisi hariç bölenleri toplamına eşitse bu sayılara arkadaş sayılar denir.
        // Örnek: 220 ve 284 220: 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
        // 284: 1 + 2 + 4 + 71 + 142 = 220

        int sayi1,sayi2,toplam1=0,toplam2=0,i;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        sayi1=scanner.nextInt();
        System.out.println("Please enter the second number : ");
        sayi2=scanner.nextInt();

        if (sayi1 > sayi2)
        {
            // If number1 is greater than number2, swap the numbers.
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        for(i=1;i<sayi1;i++){
            if(sayi1%i==0){
              toplam1=toplam1+i;
            }
            if(sayi2%i==0){
                toplam2=toplam2+i;
            }
        }

        if(sayi1==toplam2 && sayi2==toplam1){
            System.out.println("The numbers entered are friends");
        }
        else {
            System.out.println("The numbers entered are not friends");
        }


    }
}