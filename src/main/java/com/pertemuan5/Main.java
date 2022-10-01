package com.pertemuan5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    /**
     * Rivanda Putra Pratama Surahman
     * 202043500136
     * X5F
     */

    private static int Total=0;
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Integer pilih = 0;
        ArrayList<Pesan> ListPesanan = new ArrayList();
        

    do {
        System.out.println("=====================================================");
        System.out.println( "               Rivanda Starlings Coffe             " );
        System.out.println("=====================================================");
        System.out.println( "" );
        System.out.println( " 1. Menu" );
        System.out.println( " 2. Pemesanan" );
        System.out.println( " 3. Keranjang" );
        System.out.println( " 4. Pembayaran" );
        System.out.println( " 5. Keluar" );
        System.out.println( "" );
        System.out.println("=====================================================");
        System.out.print( " Pilihanmu: " );
        pilih = sc.nextInt();
        
        if(pilih == 1){ //Melihat Menu
            menu();
        }
        else if(pilih == 2){ //Melakukan pemesanan
            ListPesanan = beli(ListPesanan);

        }
        else if (pilih == 3){ //Menampilkan pemesanan 
            ListPesanan = keranjang(ListPesanan);
        }
        
        else if (pilih == 4){ //Menampilkan pemesanan 
            ListPesanan = pembayaran(ListPesanan);
        }

    }
        while(pilih !=5);
    
    }



    private static void menu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println( "               Rivanda Starlings Coffe             " );
        System.out.println("=====================================================");
        System.out.println( "" );
        System.out.println( " 1. Americano       Rp. 20.000 " );
        System.out.println( " 2. Latte           Rp. 25.000 " );
        System.out.println( " 3. Arabika         Rp. 25.000 " );
        System.out.println( " 4. Kopi Tubruk     Rp. 5.000" );
        System.out.println( "" );
        System.out.println("=====================================================");
        System.out.println("Tekan Enter untuk kembali...");
        sc.nextLine();

        return;
        

       
    }

    private static ArrayList<Pesan> beli(ArrayList<Pesan> ListPesanan) {
        String nama,gula;
        Integer qty,harga;
        Scanner sc =new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("           Rivanda Starlings Coffe                  ");
        System.out.println("=====================================================");
        System.out.print("Nama : ");
        nama = sc.nextLine();
        if (!nama.equalsIgnoreCase("Americano") && !nama.equalsIgnoreCase("Latte") && !nama.equalsIgnoreCase("Arabika") && !nama.equalsIgnoreCase("Kopi Tubruk")) {
            do {
                System.out.println("Nama Pesanan Tidak Sesuai, Mohon Ulangi Pesanan Anda");
                System.out.print("Nama : ");
                nama = sc.nextLine();
            } while(!nama.equalsIgnoreCase("Americano") && !nama.equalsIgnoreCase("Latte") &&!nama.equalsIgnoreCase("Arabika")&&!nama.equalsIgnoreCase("Kopi Tubruk"));
        }

        System.out.print("Gula : ");
        gula = sc.nextLine();

        System.out.print("Qty  : ");
        qty = sc.nextInt();
        if(qty <= 0) {
            do{
                System.out.println("Qty Minimal 1 ");
                System.out.print("Qty : ");
                qty = sc.nextInt();
            }while (qty <= 0);
        }
    
        if(nama.equals("Americano")){
            harga = 20000;
        }
        else if (nama.equals("Latte")){
            harga = 25000;
        }
        else if (nama.equals("Arabika")){
            harga = 25000;
        }
        else if (nama.equals("Kopi Tubruk")){
            harga = 25000;
        }
        else {harga = 0;}
       

        ListPesanan.add(new Pesan(nama,gula,harga,qty));
          

        return ListPesanan;
    }

    private static ArrayList<Pesan> keranjang(ArrayList<Pesan> ListPesanan) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("=====================================================");
        System.out.println("       Rivanda Starlings Coffe - List Pesanan        ");
        System.out.println("=====================================================");
        System.out.printf("| %-10s | %-5s | %-7s | %-7s | %-7s  |",
               "Nama",
               "Gula",
               "Harga",
               "Qty",
               "Jumlah" );
        System.out.println();
        System.out.println("-----------------------------------------------------");
        
        for(int index = 0; index < ListPesanan.size(); index++){
            
           System.out.printf("| %-10s | %-5s | %-7s | %-7s | %-7s  |",
                  ListPesanan.get(index).getNama(),
                  ListPesanan.get(index).getGula(),
                  ListPesanan.get(index).getHarga(),
                  ListPesanan.get(index).getQty(),
                  ( ListPesanan.get(index).getHarga() * ListPesanan.get(index).getQty() ) );
           System.out.println();
           System.out.println("=====================================================");
        }
        System.out.println("Tekan Enter untuk kembali...");
        sc.nextLine();

        return ListPesanan;
    }

    private static ArrayList<Pesan> pembayaran(ArrayList<Pesan> ListPesanan) {
        Integer TotalItem = 0;
        Integer TotalHarga = 0;
        Integer Bayar = 0;
        Integer Kembalian = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("=====================================================");
        System.out.println("         Rivanda Starlings Coffe - Pembayaran        ");
        System.out.println("=====================================================");
        System.out.printf("| %-23s | %-22s  |",
               "Total Item",
               "Total Harga");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        
        for(int index = 0; index < ListPesanan.size(); index++){

             TotalItem += ListPesanan.get(index).getQty();
             TotalHarga += ( ListPesanan.get(index).getHarga() * ListPesanan.get(index).getQty() ) ;
            
        }

        System.out.printf("| %-23s | %-22s  |",
                 TotalItem,
                 TotalHarga
                  );
           System.out.println();
           System.out.println("=====================================================");

        System.out.print("Masukkan Nominal Pembayaran : Rp. ");
        Bayar = sc.nextInt();
        if(Bayar <= TotalHarga) {
            do{
                System.out.println("Mohon Maaf, Nominal yang anda masukkan kurang dari Rp. "+TotalHarga);
                System.out.print("Masukkan Nominal Pembayaran : Rp. ");
                Bayar = sc.nextInt();
            }while (Bayar <= 0);
        }


       if (Bayar > TotalHarga) {
        Kembalian = Bayar - TotalHarga;
        System.out.println("Transaksi Berhasil, Kembalian anda sebesar : Rp. "+Kembalian);
        ListPesanan.clear();
        System.out.println("");
        System.out.println("Tekan Enter untuk kembali...");
        sc.nextLine();

        return ListPesanan;
       }
       else { System.out.println("Transaksi Berhasil !!"); ListPesanan.clear();
       System.out.println("");
       System.out.println("Tekan Enter untuk kembali...");
       sc.nextLine(); 
       
       return ListPesanan;}



       
    }


}   
