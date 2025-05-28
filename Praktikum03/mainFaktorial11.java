package Praktikum03;

import java.util.Scanner;

public class mainFaktorial11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();
        Faktorial11[] fk = new Faktorial11[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            fk[i] = new Faktorial11(nilai);
        }

        System.out.println("\nHasil faktorial dengan Brute Force:");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah " + fk[i].faktorialBF());
        }

        sc.close();
    }
}
