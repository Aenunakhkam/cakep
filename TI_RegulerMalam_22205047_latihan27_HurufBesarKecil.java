import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan27_HurufBesarKecil.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk menampilkan huruf menjadi kecil dan besar.
 */
public class TI_RegulerMalam_22205047_latihan27_HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kalimat dari pengguna
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // Menampilkan hasil formatting
        System.out.println("===== Hasil Formatting =====");

        // Menampilkan kalimat dalam huruf besar
        System.out.println("Kalimat dalam huruf besar: " + kalimat.toUpperCase());

        // Menampilkan kalimat dalam huruf kecil
        System.out.println("Kalimat dalam huruf kecil: " + kalimat.toLowerCase());

        input.close();
    }
}
