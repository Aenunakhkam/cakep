import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan28_GantiKatajava
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mengganti kata pada sesuatu kalimat
 */
public class TI_RegulerMalam_22205047_latihan28_GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input kalimat dari pengguna
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        // Input kata yang ingin diganti
        System.out.print("Masukkan kata yang ingin diganti: ");
        String kataDiganti = input.nextLine();

        // Input kata pengganti
        System.out.print("Masukkan kata pengganti: ");
        String kataPengganti = input.nextLine();

        // Mengganti kata dalam kalimat
        String kalimatBaru = kalimat.replace(kataDiganti, kataPengganti);
        
         // Menampilkan hasil formatting
        System.out.println("===== Hasil Formatting =====");


        // Menampilkan kalimat awal dengan kata yang ingin diganti
        System.out.println("Kalimat awal: " + kalimat);

        // Menampilkan kalimat baru dengan kata pengganti
        System.out.println("Kalimat baru: " + kalimatBaru);

        input.close();
    }
}
