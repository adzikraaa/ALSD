package Praktikum03;

import java.util.Scanner;

public class mainFaktorial11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial11 fk = new Faktorial11();

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));

    }
}
