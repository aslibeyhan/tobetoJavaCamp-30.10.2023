package org.example;

public class Main {
    //Mükemmel sayı,kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı.
    //Örneğin 28 in pozitif bölenleri 1+2+4+7+14=28 olduğundan mükemmel sayıdır.


    public static void main(String[] args) {
          long max = 10000000000000L;
        System.out.println("Perfect Number : ");
        for (long number=1;number<=max;number++){
            if(isPerfectNumber(number)){
                System.out.println(number);
            }
        }

    }


    // Function that writes if the sum of positive divisors is equal to the number
    public static boolean isPerfectNumber(long number){
        long total=0;
        for(int i=1;i<number;i++){
            if(number%i==0 ){
                total +=i;
            }
        }
        return total==number;
    }
}