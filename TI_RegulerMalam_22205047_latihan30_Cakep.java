import java.util.Scanner;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan30_Cakep
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk menjawab pertanyaan 
 */
public class TI_RegulerMalam_22205047_latihan30_Cakep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengajukan pertanyaan kepada pengguna
        System.out.print("Kamu ngerjain sendiri latihan 17 sampe lathan 30? (yoi/enggak): ");
        String jawaban = input.nextLine();

        // Memberikan respons berdasarkan jawaban
        if (jawaban.equalsIgnoreCase("yoi")) {
            System.out.println("cakep bener, good job dan gantengnya nambah!");
        } else {
            System.out.println("gantengnya menurun!");
        }

        input.close();
    }
}
