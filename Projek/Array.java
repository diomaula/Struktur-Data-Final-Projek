package Projek;
import java.util.*;
public class Array {
    public void Kasir() {

        int i, n, tot_semua = 0;
        String kode_barang[] = new String[10];
        String nama_barang[] = new String[10];
        int jmlh_barang[] = new int[10];
        int harga[] = new int[10];
        int tot_harga[] = new int[10];


        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Memilih Barang");
        System.out.println("======================================");
        System.out.println("Kode \t\tNama Barang ");
        System.out.println("======================================");
        System.out.println("A1 \t\t\tKemeja");
        System.out.println("A2 \t\t\tCelana");
        System.out.println("A3 \t\t\tJaket");
        System.out.println("======================================");
        System.out.print("Jumlah Data Barang Yang Akan Dibeli : ");
        n = input.nextInt();

        for (i = 0; i < n; i++) {
            int number = i + 1;
            System.out.print("Data Ke-" + number + "\n");
            System.out.print("Kode Barang [A1/A2/A3] : ");
            kode_barang[i] = input.next();
            System.out.print("Jumlah  \t : ");
            jmlh_barang[i] = input.nextInt();

            if (kode_barang[i].equals("A1")) {
                harga[i] = 100000;
                nama_barang[i] = "Kemeja";
            } else if (kode_barang[i].equals("A2")) {
                harga[i] = 120000;
                nama_barang[i] = "Celana";
            } else if (kode_barang[i].equals("A3")) {
                harga[i] = 150000;
                nama_barang[i] = "Jaket";
            } else {
                nama_barang[i] = "-";
                harga[i] = 0;
            }
            tot_harga[i] = harga[i] * jmlh_barang[i];
            tot_semua = tot_semua + tot_harga[i];
            System.out.println("======================================\n");
        }
        System.out.println("=======================================================================================");
        System.out.println("Data ke-\tKode Barang \tNama Barang\t\tHarga Barang\tJumlah Barang\tTotal Harga");
        System.out.println("=======================================================================================");

        for (i = 0; i < n; i++) {
            int number = i + 1;
            System.out.println(+number + "\t\t\t\t" + kode_barang[i] + "\t\t\t " + nama_barang[i] + "\t\t\t  " + harga[i] + "\t\t\t  " + jmlh_barang[i] + "\t\t\t  " + tot_harga[i]);
        }
        System.out.println("=======================================================================================");
        System.out.println("Total Pembayaran : Rp " + tot_semua);
        System.out.print("Bayar : Rp ");
        int bayar = input.nextInt();

        if ( bayar < tot_semua) {
            System.out.println("Jumlah uang tidak cukup!");
        } else {
            int kembalian = bayar - tot_semua;
            System.out.println("Kembalian : Rp " + kembalian);
            System.out.println("Terima kasih telah melakukan pembayaran!\n");
        }
    }
}
