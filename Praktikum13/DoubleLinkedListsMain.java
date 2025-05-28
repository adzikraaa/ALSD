package Praktikum13;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Depan");
            System.out.println("2. Tambah Belakang");
            System.out.println("3. Tambah Setelah NIM");
            System.out.println("4. Cetak");
            System.out.println("5. Hapus Depan");
            System.out.println("6. Hapus Belakang");
            System.out.println("7. Hapus Setelah NIM");
            System.out.println("8. Tambah di Index");
            System.out.println("9. Hapus di Index");
            System.out.println("10. Tampilkan Data Pertama");
            System.out.println("11. Tampilkan Data Terakhir");
            System.out.println("12. Tampilkan Data Index ke-...");
            System.out.println("13. Tampilkan Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    dll.addFirst(inputData(sc));
                    break;
                case 2:
                    dll.addLast(inputData(sc));
                    break;
                case 3:
                    System.out.print("Masukkan NIM setelah mana ingin disisipkan: ");
                    String key = sc.nextLine();
                    dll.insertAfter(key, inputData(sc));
                    break;
                case 4:
                    dll.print();
                    break;
                case 5:
                    dll.removeFirst();
                    break;
                case 6:
                    dll.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM setelah mana ingin dihapus: ");
                    dll.removeAfter(sc.nextLine());
                    break;
                case 8:
                    System.out.print("Masukkan index: ");
                    int idx = sc.nextInt(); sc.nextLine();
                    dll.add(inputData(sc), idx);
                    break;
                case 9:
                    System.out.print("Masukkan index yang ingin dihapus: ");
                    dll.remove(sc.nextInt());
                    sc.nextLine();
                    break;
                case 10:
                    tampilData(dll.getFirst());
                    break;
                case 11:
                    tampilData(dll.getLast());
                    break;
                case 12:
                    System.out.print("Masukkan index: ");
                    tampilData(dll.getIndex(sc.nextInt()));
                    sc.nextLine();
                    break;
                case 13:
                    System.out.println("Jumlah data: " + dll.size());
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilih != 0);

        sc.close();
    }

    static Mahasiswa11 inputData(Scanner sc) {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble(); sc.nextLine();
        return new Mahasiswa11(nim, nama, kelas, ipk);
    }

    static void tampilData(Mahasiswa11 mhs) {
        if (mhs != null) {
            mhs.tampil();
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }
}

