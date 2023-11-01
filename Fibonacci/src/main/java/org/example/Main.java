package org.example;

public class Main {
    public static void main(String[] args) {
        int n=100;
        int a=1;
        int b=1;
        int c;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }

    }
}