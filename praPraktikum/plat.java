package praPraktikum;
import java.util.Scanner;

public class plat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
                {"B", "A", "N", "T", "E", "N"},
                {"J", "A", "K", "A", "R", "T", "A"},
                {"B", "A", "N", "D", "U", "N", "G"},
                {"C", "I", "R", "E", "B", "O", "N"},
                {"B", "O", "G", "O", "R"},
                {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},
                {"S", "E", "M", "A", "R", "A", "N", "G"},
                {"S", "U", "R", "A", "B", "A", "Y", "A"},
                {"M", "A", "L", "A", "N", "G"},
                {"T", "E", "G", "A", "L"}
        };

        System.out.print("Masukkan kode plat mobil (huruf kapital): ");
        char kodeInput = input.next().charAt(0);

        String namaKota = cariKota(KODE, KOTA, kodeInput);

        if (namaKota != null) {
            System.out.println("Kota: " + namaKota);
        } else {
            System.out.println("Kode plat mobil tidak ditemukan.");
        }
    }

    public static String cariKota(char[] KODE, String[][] KOTA, char kodeInput) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == kodeInput) {
                StringBuilder namaKota = new StringBuilder();
                for (int j = 0; j < KOTA[i].length; j++) {
                    namaKota.append(KOTA[i][j]);
                }
                return namaKota.toString();
            }
        }
        return null;
    }
}

