
package java1;

import java.util.Random;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String check;   
       do {
           System.out.println("tiep tuc chuong trinh (yes or no)");
           check = scanner.next();
           int n = random.nextInt(100-1+1) +1;
           if(n %2==0){
               System.out.println(n + " la so chan");
           }else{
               System.out.println(n + " la so le");
           }
       }while(check.equals("yes"));    
    }                
}

