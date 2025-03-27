package Praktikum04;

import java.util.Scanner;

// public class mahasiswaDemo11 {
//     public static void main(String[] args) {
//         mahasiswaBerprestasi11 list = new mahasiswaBerprestasi11();
        
//         Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
//         Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
//         Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
//         Mahasiswa m4 = new Mahasiswa("126", "Sita", "2A", 3.9);
//         Mahasiswa m5 = new Mahasiswa("127", "Miki", "2A", 3.7);

//         list.tambah(m1);
//         list.tambah(m2);
//         list.tambah(m3);
//         list.tambah(m4);
//         list.tambah(m5);

//         System.out.println("Data mahasiswa sebelum sorting:");
//         list.tampil();

//         System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
//         list.bubbleSort();
//         list.tampil();

//         System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
//         list.insertionSort();
//         list.tampil();
//     }


class mahasiswaDemo11 {
    public static void main(String[] args) {
        mahasiswaBerprestasi11 list = new mahasiswaBerprestasi11();
        Scanner sc = new Scanner(System.in);
System.out.print("Masukkan jumlah mahasiswa: ");
int jumMhs = sc.nextInt();
Mahasiswa[] listMhs = new Mahasiswa[jumMhs];


        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());

            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        list.tampil();

        // // Melakukan pencarian data sequential
        // System.out.println("================================");
        // System.out.println("Pencarian Data");
        // System.out.println("================================");
        // System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        // double cari = sc.nextDouble();

        // System.out.println("Menggunakan Sequential Searching");
        // int posisi = list.sequentialSearching(cari);

        // list.tampilPosisi(cari, posisi);
        // list.tampilDataSearch(cari, posisi);

        // Melakukan pencarian data Binary
System.out.println("------------------------------------------------");
System.out.println("Pencarian data");
System.out.println("------------------------------------------------");
System.out.print("Masukkan IPK mahasiswa yang dicari: ");
double cari = sc.nextDouble();

System.out.println("------------------------------------------------");
System.out.println("Menggunakan binary search");
System.out.println("------------------------------------------------");

double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
int pss2 = (int) posisi2;

list.tampilPosisi(cari, pss2);
list.tampilDataSearch(cari, pss2);

    }
}

