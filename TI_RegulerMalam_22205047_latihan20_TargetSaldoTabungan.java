// Import library java
/**
 * Nama File       : TI_RegulerMalam_22205047_latihan18_ProgramTargetSaldoTabungan.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk mengitung terget isi saldo dalam waktu 8 bulan
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

// Init class
public class TI_RegulerMalam_22205047_latihan20_TargetSaldoTabungan {

    // Run main method
    public static void main(String[] args) {

	// Init scanner input
        Scanner scanner = new Scanner(System.in);

	// Set variabel
        int saldoAwal,bungaPerbulan,saldoTarget;

 	// Ask Saldo awal
        System.out.print("Saldo Awal (Rp): ");
        saldoAwal = scanner.nextInt();

	// ask bunga/bulan
        System.out.print("Bunga / Bulan (%): ");
        bungaPerbulan = scanner.nextInt();

	// ask saldo target
        System.out.print("Saldo Target (Rp): ");
        saldoTarget = scanner.nextInt();

	// process saldo target
        int bulan = (saldoTarget-saldoAwal)/(saldoAwal*bungaPerbulan/100);

 	// Init format nilai ke desimal 
        NumberFormat formatter = new DecimalFormat("#,###,###");

  	// Looping	  
        for(int i = 1;i<= bulan;i++) {
        	 
	    // Proses saldo target
            saldoAwal += saldoAwal * bungaPerbulan / 100;

	    // Format saldo ke desimal
            String formattedSaldo = "Rp. " + formatter.format(saldoAwal);

	    // Ganti koma (,) ke titik (.)
            formattedSaldo = formattedSaldo.replace(",", ".");
	
	    // Tampilkan hasil
            System.out.println("Saldo di bulan ke - " + i + " " + formattedSaldo);
        }

        scanner.close();
    }
}