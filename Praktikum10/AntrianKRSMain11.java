import java.util.Scanner;

public class AntrianKRSMain11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AntrianKRS11 antrianKRS = new AntrianKRS11();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil 2 Mahasiswa untuk Proses KRS");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa yang Sudah Diproses");
            System.out.println("8. Cetak Jumlah Mahasiswa yang Belum Diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Masukkan angka yang valid: ");
                scanner.next();
            }
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = scanner.nextLine();
                    System.out.print("Semester: ");
                    int semester = 0;
                    while (!scanner.hasNextInt()) {
                        System.out.print("Masukkan angka untuk semester: ");
                        scanner.next();
                    }
                    semester = scanner.nextInt();
                    scanner.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nama, nim, prodi, semester);
                    antrianKRS.tambahAntrian(mhs);
                    break;
                case 2:
                    antrianKRS.panggilAntrian();
                    break;
                case 3:
                    antrianKRS.tampilSemua();
                    break;
                case 4:
                    antrianKRS.tampilTerdepan();
                    break;
                case 5:
                    antrianKRS.tampilTerakhir();
                    break;
                case 6:
                    System.out.println(" Jumlah antrian: " + antrianKRS.jumlahAntrian());
                    break;
                case 7:
                    System.out.println(" Jumlah mahasiswa diproses: " + antrianKRS.getJumlahDiproses());
                    break;
                case 8:
                    System.out.println(" Jumlah belum diproses: " + antrianKRS.getJumlahBelumDiproses());
                    break;
                case 9:
                    antrianKRS.kosongkanAntrian();
                    System.out.println(" Antrian dikosongkan.");
                    break;
                case 0:
                    System.out.println(" Keluar dari program.");
                    break;
                default:
                    System.out.println(" Menu tidak valid.");
            }

        } while (pilihan != 0);

        scanner.close();
    }
} 
