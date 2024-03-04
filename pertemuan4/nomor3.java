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
public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //sisi segitiga
        System.out.println("Masukkan panjang sisi segitiga:");
        System.out.print("Sisi a: ");
        int a = input.nextInt();
        System.out.print("Sisi b: ");
        int b = input.nextInt();
        System.out.print("Sisi c: ");
        int c = input.nextInt();

        //  segitiga menggunakan hukum Pythagoras
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga siku-siku");
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga lancip");
        } else {
            System.out.println("Segitiga tumpul");
        }

        input.close();
    }
}
