
package javaone;

import java.util.Scanner;

public class JavaOne {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ho va ten: ");
        String name = scanner.nextLine();
        System.out.println("nam sinh: ");
        String year = scanner.nextLine();
        System.out.println("tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Gioi tinh: ");
        String gioitinh = scanner.nextLine();
         
        System.out.println("GPA: ");
        Float GPA = scanner.nextFloat();
   scanner.nextLine();
        System.out.println("que quan: ");
        String quequan = scanner.nextLine();
        
        System.out.println(name +"-" + year + "-" + gioitinh +"-"+GPA+ "-"+ quequan);
                
             
    }
    
}
