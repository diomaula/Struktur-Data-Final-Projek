package Projek;
import java.util.Scanner;

public class DataPenjualan {

     int nomor;
     String nama;
     DataPenjualan next; //elemen selanjutnya

    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.print("Masukkan Nomor Antrian : ");
        nomor = in.nextInt();
        System.out.print("Masukkan Nama      : ");
        nama = str.nextLine();
        System.out.println("");
        next=null;
    }

    public void read(){
        System.out.println(+nomor + "\t\t\t\t\t" +nama);

    }
}
