package Praktikum02;

import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        Mahasiswa11[] arrayOfMahasiswa = new Mahasiswa11[3];

        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa11();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

            System.out.println("--------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }

        sc.close();
    }
}
