package Praktikum12;

import java.util.Scanner;

public class Main11Tugas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Queue11Tugas antrian = new Queue11Tugas();
            int pilihan;
            
            do {
                System.out.println("\n=== Layanan Unit Kemahasiswaan 11Tugas ===");
                System.out.println("1. Tambah Antrian Mahasiswa");
                System.out.println("2. Panggil Antrian");
                System.out.println("3. Lihat Antrian Kosong");
                System.out.println("4. Lihat Antrian Penuh");
                System.out.println("5. Tampilkan Antrian");
                System.out.println("6. Tampilkan Antrian Terdepan & Terakhir");
                System.out.println("7. Tampilkan Jumlah Antrian");
                System.out.println("8. Kosongkan Antrian");
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");
                pilihan = input.nextInt();
                input.nextLine(); 
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan NIM: ");
                        String nim = input.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = input.nextLine();
                        Mahasiswa11Tugas mhs = new Mahasiswa11Tugas(nim, nama);
                        antrian.enqueue(mhs);
                    }
                    case 2 -> antrian.dequeue();
                    case 3 -> System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
                    case 4 -> System.out.println("Apakah antrian penuh? " + antrian.isFull());
                    case 5 -> antrian.tampilkanAntrian();
                    case 6 -> antrian.tampilkanDepanDanBelakang();
                    case 7 -> antrian.tampilkanJumlah();
                    case 8 -> antrian.clear();
                    case 0 -> {System.out.println("Terima kasih!");
                    System.exit(0);}
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 0);
        }
    }
}
