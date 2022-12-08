
package oryantasyon1;

import java.util.Scanner;

public class o9 {
    public static void main(String[] args) {
             Scanner scanner  = new Scanner(System.in) ;
int birincikardes ;
int ikincikardes ;
int toplam ;
int ortalama;
        System.out.println("birincikardes:");
        birincikardes = scanner.nextInt();
        System.out.println("ikincikardes:");
        ikincikardes = scanner.nextInt();
        toplam= birincikardes+ikincikardes ;
        ortalama = toplam/2 ;
        System.out.println("toplam =" + toplam);
        System.out.println("ortalama =" + ortalama);
        
    }
    
}
