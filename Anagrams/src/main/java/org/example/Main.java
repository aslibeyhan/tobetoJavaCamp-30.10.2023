package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter the first word : ");
        String string1= scanner.nextLine();
        System.out.println("Please enter the second word : ");
        String string2=scanner.nextLine();

        //Convert entire words to lowercase for case sensitivity
        String a=string1.toLowerCase();
        String b=string2.toLowerCase();

        //Assigning the incoming string expression to a character array
        char[] a1=a.toCharArray();
        char[] b1=b.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(b1);

        if(Arrays.equals(a1, b1)){
            System.out.println("The entered values are anagrams");
        }else{
            System.out.println("The entered values are not anagrams");
        }
        


    }
}