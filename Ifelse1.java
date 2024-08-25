
package javaone;

import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        if(a>0){
            System.out.println("Positive");
        } else if (a<0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }       
      
    }
    
}
