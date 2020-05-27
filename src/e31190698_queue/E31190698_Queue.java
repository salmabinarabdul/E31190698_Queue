/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190698_queue;
import java.util.*;
/**
 *
 * @author Acer
 */
public class E31190698_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //membuat dan menginisialisasi interface queue menggunakan objek linked list
        Queue<String> antrianPembayaran = new LinkedList<>();
        
        //menambahkan data pembayaran atau nilai element baru ke list queue (Operasi Enqueue)
        antrianPembayaran.add("Adi");
        antrianPembayaran.add("Nia");
        antrianPembayaran.add("Dony");
        antrianPembayaran.add("Cici");
        antrianPembayaran.add("Andre");
        
        //menampilkan output hasil list queue
        System.out.println("Antrian Pembayaran Tiket Bus : "+antrianPembayaran);
        
        //menghapus sebuah element dari queue menggunakan method remove() (Operasi Dequeue)
        //method remove () akan melempar NoSuchElementExeption, jika list queue kosong
        String nama = antrianPembayaran.remove();
        
        System.out.println("Menghapus dari Antrian Pembayaran : "+nama+ "|Daftar Antrian Baru : "+antrianPembayaran);
        
        //menghapus sebuah element dari queue menggunakan method poll()
        //method remove () akan mengembalikan null, jika list queue kosong
        nama = antrianPembayaran.poll();
        System.out.println("Menghapus dari Antrian Pembayaran : "+nama+ "|Daftar Antrian Baru :"+antrianPembayaran);
                
                
                
                
    }
    
}
