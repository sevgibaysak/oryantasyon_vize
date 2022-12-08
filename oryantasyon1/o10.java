
package oryantasyon1;

import java.util.Scanner;

public class o10 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("dairenin yarıcap degerini giriniz");
        int r = scan.nextInt();
        double alan=Math.PI*r*r;
        double cevre=2*Math.PI*r;
        System.out.println("dairenin alanı:"+alan);
        System.out.println("dairenin cevresi:"+cevre);
    }
    
}
