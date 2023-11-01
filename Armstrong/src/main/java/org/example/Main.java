package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //N haneli bir sayının basamaklarının n'inci üstlerinin toplamı, sayının kendisine eşitse,
        // böyle sayılara Armstrong sayı denir.
        // Örneğin 153 sayısı 3 basmaklıdır.(1^3)+(5^3)+(3^3)=153 olduğundan bir Armstrong sayısıdır.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int number=scanner.nextInt();
        int digitCount=0;
        int tempNumber=number;
        int total=0;
        int digitPow;
        int digitNumber;


        while (tempNumber!=0){       //Loop to find number of digits.
         tempNumber /= 10;
         digitCount++;
        }


        tempNumber=number;
        while(tempNumber!=0){          // Armstrong number checking loop
             digitNumber=tempNumber%10;
             digitPow=1;
            for(int i=1;i<=digitCount;i++){
               digitPow *=digitNumber;
            }
            total +=digitPow;
            tempNumber /=10;
        }

        if(total==number){
            System.out.println("The number entered is the Armstrong number ");
        }else {
            System.out.println("The number entered is not the Armstrong number");
        }
    }
}