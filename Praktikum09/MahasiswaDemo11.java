
import java.util.Scanner;

public class MahasiswaDemo11 {
    public static void main(String[] args) {
        StackTugasMahasiswa11 stack = new StackTugasMahasiswa11(5);
        Scanner sc = new Scanner (System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Pertama Kali Mengumpulkan Tugas");
            System.out.println("6. Menghitung Jumlah Tugas");

            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa11 mhs = new Mahasiswa11(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa11 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = sc.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);

                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa11 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("\nDaftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                Mahasiswa11 bawah = stack.elemenPertama();
                if (bawah != null) {
                    System.out.println("Tugas pertama dikumpulkan oleh: " + bawah.nama);
                }
                break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.count());
                break;

            

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih <= 4);
        
    }
}
