
package oryantasyon1;

import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

public class o3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=oku.nextInt();
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++){
            faktoriyel=faktoriyel*i;
        }
        System.out.println("sonuc:"+ faktoriyel);   
    }
    
}
