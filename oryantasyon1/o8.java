
package oryantasyon1;

import java.util.Scanner;

public class o8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayi");
        int a = scan.nextInt();
         System.out.println("2. sayi");
        int b = scan.nextInt();
         System.out.println("3. sayi");
        int c = scan.nextInt();
        if(a>b&&a>c){
            if(b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }
    }
    
}
