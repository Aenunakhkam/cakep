import java.util.Scanner;
/**
 * Nama File       : TI_RegulerMalam_22205047_latihan23_EjaanNama.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mengeja sesuatu kata 
 */

public class TI_RegulerMalam_22205047_latihan25_EjaanNama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nama depan dari pengguna
        System.out.print("Masukkan nama depan: ");
        String namaDepan = input.nextLine();

        // Mengeja nama depan dan memberikan hasil
        System.out.println("Hasil ejaan nama depan:");

        for (int i = 0; i < namaDepan.length(); i++) {
            char huruf = namaDepan.charAt(i);
            String hasil = "Huruf ke-" + (i + 1) + " = " + huruf;

            System.out.println(hasil);
        }

        input.close();
    }
}
