package Praktikum04;
import java.util.Scanner;

public class dosenmain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen11 dataDosen = new dataDosen11();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urutkan ASC (Bubble Sort)");
            System.out.println("4. Urutkan DSC (Selection Sort)");
            System.out.println("5. Urutkan ASC (Insertion Sort)");
            System.out.println("6. Cari Nama Dengan SequentialSearch");
            System.out.println("7. Cari Usia Dengan BinarySearch");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (true = L, false = P): ");
                    boolean jenisKelamin = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();

                    dosen11 dsn = new dosen11(kode, nama, jenisKelamin, usia);
                    dataDosen.tambah(dsn);
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.sortingASC();
                    System.out.println("Data diurutkan ASC (Bubble Sort).");
                    break;
                case 4:
                    dataDosen.sortingDSC();
                    System.out.println("Data diurutkan DSC (Selection Sort).");
                    break;
                case 5:
                    dataDosen.insertionSort();
                    System.out.println("Data diurutkan ASC (Insertion Sort).");
                    break;

                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    System.out.println("Hasil Pencarian:");
                    dataDosen.pencarianDataSequential(cariNama);
                    break;

                 case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    System.out.println("Hasil Pencarian:");
                    dataDosen.pencarianDataBinary(cariUsia);
                    break;
                
                
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}