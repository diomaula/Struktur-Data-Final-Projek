package Projek;
import java.util.Scanner;
public class Main  {

    public static void main(String[] args) {

        int menu;
        Scanner input = new Scanner(System.in);
        Array AA = new Array();
        LinkedList LL = new LinkedList();

        System.out.println("Selamat datang di TOKO PAKAIAN");
        System.out.println("===============================");

        do{
            System.out.println("Pilih menu : ");
            System.out.println("1. Ambil nomor antrian");
            System.out.println("2. Lihat data antrian");
            System.out.println("3. Pemanggilan nomor antri");
            System.out.println("4. Pembelian");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda : " );

            menu = input.nextInt();
            if(menu == 1){
                LL.enqueue();
            }else if(menu == 2){
                LL.view();
            }else if(menu == 3){
                LL.dequeue();
            }else if(menu == 4) {
                AA.Kasir();
            }else if (menu == 5){
                System.out.println("Terima Kasih Sudah Berbelanja!");
            }else{
                System.out.println("Perhatikan data yang Anda inputkan!!!!");
            }
        }while(menu!= 5);
    }
}
