package Praktikum02;

import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matkul: ");
        int jumMatkul = sc.nextInt();
        sc.nextLine();
        
        MataKuliah11[] arrayOfMatakuliah = new MataKuliah11[jumMatkul];
        for (int i = 0; i < jumMatkul; i++) {
            System.out.println("Masukkan Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah [i] = new MataKuliah11("", "", 0, 0);
            arrayOfMatakuliah [i].tambahData(sc);
        }

        System.out.println("=== DAFTAR MATKUL ===");
        for (int i = 0; i < jumMatkul; i++) {
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
    
}


