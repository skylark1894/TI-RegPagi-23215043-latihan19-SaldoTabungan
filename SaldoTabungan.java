/*
 * Nama:Moh.arif prasetyo
 * Nim : 23215043
 * Prodi : Teknik Informatika
 */
package pertemuan5;

/**
 *
 * @author user
 */

public class SaldoTabungan {
    public static void main(String[] args) {
        double saldoAwal = 2500000;
        double bungaPerBulan = 0.15;
        int lamaBulan = 6;

        for (int i = 1; i <= lamaBulan; i++) {
            saldoAwal += saldoAwal * bungaPerBulan;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", i, saldoAwal);
        }
    }
}