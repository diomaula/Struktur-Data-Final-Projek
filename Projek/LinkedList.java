package Projek;
public class LinkedList {

    public DataPenjualan head, tail;

    //konstruktor
    public LinkedList(){
        head = null; // elemen pertama
        tail = null; // elemen terakhir
    }

// method ambil antrian
    public void enqueue(){
        DataPenjualan dt = new DataPenjualan();
        dt.input();
        if(head == null)
            head = dt;
        else
            tail.next = dt;
        tail = dt;
    }

// method pemanggilan nomor antrian
    public void dequeue(){
            if(head == null){
                System.out.println("Data Kosong!!!");
            }else{
                System.out.println("Nomor antrian " + head.nomor + " atas nama " + head.nama);
                head = head.next;
                System.out.println("Silahkan Melakukan Pembelian \n");
            }
        }

// method lihat antrian
    public void view(){
        if(head == null){
            System.out.println("Data Kosong!!!");
        }else{
            System.out.println("==============================");
            System.out.println("Nomor Antrian\t\tNama");
            System.out.println("==============================");
            for (DataPenjualan a = head; a!=null; a = a.next) a.read();
            System.out.println("==============================");

        }
    }
}
