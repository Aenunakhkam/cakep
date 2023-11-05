import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.Locale;

/**
 * Nama File       : TI_RegulerMalam_22205047_latihan26_WaktuSaatIni.java
 * Nama            : Aenun Akhkam
 * Kelas           : PBO12
 * NIM             : 22205047
 * Deskripsi       : Program untuk menampilkan waktu saat ini 
 */
public class TI_RegulerMalam_22205047_latihan26_WaktuSaatIni {
    public static void main(String[] args) {
        // Dapatkan zona waktu default dari sistem
        ZoneId zonaWaktu = ZoneId.systemDefault();

        // Dapatkan waktu saat ini sesuai dengan zona waktu
        LocalDateTime waktuSaatIni = LocalDateTime.now(zonaWaktu);

        // Format waktu sesuai dengan kebutuhan Anda dengan bahasa Indonesia
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy, HH:mm:ss", new Locale("id"));

        String waktuYangSudahDiformat = waktuSaatIni.format(formatter);

        // Tampilkan waktu saat ini dalam bahasa Indonesia
        System.out.println("Hari ini adalah hari: " + waktuYangSudahDiformat);
    }
}
