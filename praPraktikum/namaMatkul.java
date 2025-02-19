package praPraktikum;
import java.util.Scanner;

public class namaMatkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Mengelola Jadwal Kuliah");
        System.out.println("================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        sc.nextLine(); 

        String[] namaMatkul = new String[jumlahMatkul];
        int[] sks = new int[jumlahMatkul];
        int[] semester = new int[jumlahMatkul];
        String[] hariKuliah = new String[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = sc.nextLine();

            System.out.print("Masukkan jumlah SKS untuk MK " + namaMatkul[i] + ": ");
            sks[i] = sc.nextInt();

            System.out.print("Masukkan semester untuk MK " + namaMatkul[i] + ": ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Masukkan hari kuliah untuk MK " + namaMatkul[i] + ": ");
            hariKuliah[i] = sc.nextLine();
        }

        System.out.println("\n================================");
        System.out.println("Jadwal Mata Kuliah");
        System.out.println("================================");
        System.out.printf("%-35s %-10s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-35s %-10d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
        }

        while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Tampilkan semua jadwal");
            System.out.println("2. Cari berdasarkan hari");
            System.out.println("3. Cari berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) tampilkanJadwal(namaMatkul, sks, semester, hariKuliah, null, -1);
            else if (pilihan == 2) {
                System.out.print("Masukkan hari: ");
                tampilkanJadwal(namaMatkul, sks, semester, hariKuliah, sc.nextLine(), -1);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                tampilkanJadwal(namaMatkul, sks, semester, hariKuliah, null, sc.nextInt());
                sc.nextLine();
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                cariMataKuliah(namaMatkul, sks, semester, hariKuliah, sc.nextLine());
            } else if (pilihan == 5) {
                System.out.println("Terima kasih!");
                break;
            } else System.out.println("Pilihan tidak valid.");
        }

        sc.close();
    }

    public static void tampilkanJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari, int sem) {
        System.out.println("\n================================");
        System.out.println("Jadwal Kuliah");
        System.out.println("================================");
        System.out.printf("%-35s %-10s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");

        for (int i = 0; i < namaMatkul.length; i++) {
            if ((hari == null || hariKuliah[i].equalsIgnoreCase(hari)) &&
                (sem == -1 || semester[i] == sem)) {
                System.out.printf("%-35s %-10d %-10d %-10s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
            }
        }
    }  

    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String nama) {
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(nama)) {
                System.out.println("\n================================");
                System.out.println("Informasi Mata Kuliah");
                System.out.println("================================");
                System.out.printf("Mata Kuliah: %s\nSKS: %d\nSemester: %d\nHari: %s\n", namaMatkul[i], sks[i], semester[i], hariKuliah[i]);
                return;
            }
        }
        System.out.println("Mata kuliah tidak ditemukan.");
    }
}
