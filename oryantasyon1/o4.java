
package oryantasyon1;

import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi= oku.nextInt();
        if(sayi%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }
    }
    
}
