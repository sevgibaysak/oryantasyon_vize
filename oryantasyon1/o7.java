
package oryantasyon1;

import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen boyunuzu(metre cinsinden) giriniz");
        double boy =scan.nextDouble();
        System.out.println("lütfen kilonuzu giriniz");
        double kilo =scan.nextDouble();
        double indeks =kilo/(boy*boy);
        System.out.println("vücut kitle indeksiniz:"+ indeks);
    }
    
}
