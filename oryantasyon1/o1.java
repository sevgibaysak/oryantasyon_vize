
package oryantasyon1;

import java.util.Scanner;

public class Oryantasyon1 {

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
      int s1 = oku.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int s2 = oku.nextInt();
        int ortalama =(s1+s2)/2;
        System.out.println("ortalama:"+ ortalama);
        
        
        
    }
    
}
