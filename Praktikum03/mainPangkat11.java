package Praktikum03;

import java.util.Scanner;

public class mainPangkat11 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah elemen: ");
    int elemen = input.nextInt();

    Pangkat11[] png = new Pangkat11 [elemen];
    for(int i=0; i<elemen; i++){

    System.out.print("Masukan nilai basis elemen ke-" + (i+1) + ": ");
    int basis = input.nextInt();

    System.out.print("Masukan nilai pangkat elemen ke-" + (i+1) + ": ");
    int pangkat = input.nextInt();

    png[i] = new Pangkat11(basis, pangkat);

    System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat11 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());}
}
    System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
    for (Pangkat11 p : png) {
    System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));

            }
            input.close();
        }
        
    }

