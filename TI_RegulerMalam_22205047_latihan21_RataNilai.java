import java.util.Scanner;
/**
 * Nama File       : TI_RegulerMalam_22205047_latihan18_ProgramRataNilai.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mengitung Rata nilai mahasiswa
 */
public class TI_RegulerMalam_22205047_latihan21_RataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int jumlahIterasi = 4; // Batasi jumlah iterasi menjadi 4

        double totalNilai = 0;

        for (int i = 1; i <= jumlahIterasi; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();
            totalNilai += nilai;
        }

        double rataRata = totalNilai / jumlahIterasi;
        System.out.println("Maka, Nilai Rata - ratanya adalah: " + rataRata);
        // Developed by Aenun Akhkam
        System.out.println("Devloped By : Aenun Akhkam");

        input.close();
    }
}

