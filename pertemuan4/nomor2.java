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
public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi 1: ");
        int sisi1 = input.nextInt();
        
        System.out.print("Masukkan panjang sisi 2: ");
        int sisi2 = input.nextInt();
        
        System.out.print("Masukkan panjang sisi 3: ");
        int sisi3 = input.nextInt();
        
        if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Ini termasuk bentuk kubus");
        } else {
            System.out.println("Bukan termasuk bentuk  Kubus");
        }
    }
}
    

