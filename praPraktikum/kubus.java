package praPraktikum;

import java.util.Scanner;

public class kubus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextInt();

        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolume(sisi);
                    break;
                case 2:
                    hitungLuasPermukaan(sisi);
                    break;
                case 3:
                    hitungKeliling(sisi);
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        sc.close(); // Move scanner closing outside the loop
    }

    public static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Hitung Volume");
        System.out.println("2. Hitung Luas Permukaan");
        System.out.println("3. Hitung Keliling");
        System.out.println("4. Keluar");
    }

    public static void hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        System.out.println("Volume kubus adalah: " + volume);
    }

    public static void hitungLuasPermukaan(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
    }

    public static void hitungKeliling(int sisi) {
        int keliling = 12 * sisi;
        System.out.println("Keliling kubus adalah: " + keliling);
    }
}
