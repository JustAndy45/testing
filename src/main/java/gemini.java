/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class gemini {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai pertama: ");
        double nilai1 = input.nextDouble();
        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Masukkan nilai kedua: ");
        double nilai2 = input.nextDouble();

        double hasil = calculate(nilai1, operator, nilai2);

        if (Double.isNaN(hasil)) {
            System.out.println("Pembagi tidak boleh 0!");
        } else if (Double.isInfinite(hasil)) {
            System.out.println("Operator tidak valid!");
        } else {
            System.out.println("Hasil: " + hasil);
        }
    }

    static double calculate(double nilai1, char operator, double nilai2) {
        switch (operator) {
            case '+':
                return nilai1 + nilai2;
            case '-':
                return nilai1 - nilai2;
            case '*':
                return nilai1 * nilai2;
            case '/':
                if (nilai2 != 0) {
                    return nilai1 / nilai2;
                } else {
                    throw new IllegalArgumentException("Pembagi tidak boleh 0!");
                }
            default:
                throw new IllegalArgumentException("Operator tidak valid!");
        }
    }
}
