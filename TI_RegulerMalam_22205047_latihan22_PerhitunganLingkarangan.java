import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan18_ProgramPerhitunganLingkaran.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk menghitung jari-jari, luas, dan keliling lingkaran.
 */

public class TI_RegulerMalam_22205047_latihan22_PerhitunganLingkarangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Perhitungan Lingkaran =====");
        // Input diameter lingkaran
        System.out.print("Masukkan diameter lingkaran: ");
        double diameter = input.nextDouble();

        // Periksa apakah diameter valid (harus positif)
        if (diameter <= 0) {
            System.out.println("Diameter harus lebih dari 0.");
        } else {
            // Hitung jari-jari lingkaran
            double jariJari = diameter / 2.0;

            // Hitung luas lingkaran
            double luas = hitungLuas(jariJari);

            // Hitung keliling lingkaran
            double keliling = hitungKeliling(jariJari);

            // Tampilkan hasil perhitungan lingkaran
            System.out.println("===== Hasil Perhitungan Lingkaran =====");
            System.out.println("Jari-jari lingkaran: " + jariJari);
            System.out.println("Luas lingkaran: " + luas);
            System.out.println("Keliling lingkaran: " + keliling);
        }

        input.close();
    }

    // Fungsi untuk menghitung luas lingkaran
    public static double hitungLuas(double jariJari) {
        return Math.PI * Math.pow(jariJari, 2);
    }

    // Fungsi untuk menghitung keliling lingkaran
    public static double hitungKeliling(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}
