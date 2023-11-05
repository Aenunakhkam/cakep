import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan23_Perbandinganduanilai.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mehitung dan mencari perbandingan dua nilai
 */

public class TI_RegulerMalam_22205047_latihan24_Perbandingan_dua_nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Perbandingan Dua Nilai ===");

        boolean ulangi = true;

        while (ulangi) {
            System.out.print("Masukkan nilai pertama: ");
            double nilai1 = input.nextDouble();

            System.out.print("Masukkan nilai kedua: ");
            double nilai2 = input.nextDouble();

            if (nilai1 == nilai2) {
                System.out.println("Nilai pertama sama dengan nilai kedua.");
            } else if (nilai1 < nilai2) {
                System.out.println("Nilai pertama lebih kecil dari nilai kedua.");
            } else {
                System.out.println("Nilai pertama lebih besar dari nilai kedua.");
            }

            System.out.print("Ulangi aktivitas? (ya/tidak): ");
            String jawaban = input.next();

            if (!jawaban.equalsIgnoreCase("ya")) {
                ulangi = false;
            }
        }

        input.close();
    }
}

