import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan23_NilaiTerbesarTerkecil.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk menghitung Nilai terbesar dan terkecil
 */
public class TI_RegulerMalam_22205047_latihan23_NilaiTerbesarTerkecil {
    public static void main(String[] args) {
        int panjangJudul = 40; // Panjang total judul (termasuk tanda "=")
        System.out.println("=== Program nilai terbesar dan terkecil mahasiswa ===");

        Scanner input = new Scanner(System.in);

        // Input nama petugas
        System.out.print("Masukkan nama petugas: ");
        String namaPetugas = input.nextLine();

        // Input jumlah nilai mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        double[] nilaiMahasiswa = new double[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextDouble();
        }

        double nilaiTerbesar = Double.NEGATIVE_INFINITY;
        double nilaiTerkecil = Double.POSITIVE_INFINITY;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            double nilai = nilaiMahasiswa[i];

            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }

            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }

        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Nilai terbesar: " + nilaiTerbesar);
        System.out.println("Nilai terkecil: " + nilaiTerkecil);

        System.out.println("Nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
        input.close();
    }
}
