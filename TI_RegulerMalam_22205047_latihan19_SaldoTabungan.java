/**
 * Nama File       : TI_RegulerMalam_22205047_latihan18_ProgramSaldoTabungan.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mengitung isi saldo tabungan dari bulan 1 sampai bulan 6
 */

public class TI_RegulerMalam_22205047_latihan19_SaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000; // Saldo awal
        double bungaPerBulan = 0.15; // Bunga per bulan (15%)
        int lamaBulan = 6; // Lama dalam bulan

        // Menghitung saldo tabungan setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldoAwal = saldoAwal + (saldoAwal * bungaPerBulan);
            System.out.println("Saldo bulan ke-" + bulan + " Rp." + Math.round(saldoAwal));
        }
    }
}
