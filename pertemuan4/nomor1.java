/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

/**
 *
 * @author Nadila Suci P
 */
import java.util.Scanner;
public class nomor1 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Masukkan nilai n yang lebih besar dari atau sama dengan 1.");
        } else {
            System.out.println("Bilangan dari 1 sampai dengan " + n + " adalah:");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
        
        input.close();
    }
}


