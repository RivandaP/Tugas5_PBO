package com.pertemuan5;

public class Pesan {

     /**
     * Rivanda Putra Pratama Surahman
     * 202043500136
     * X5F
     */

        String gula;
        static String nama;
        Integer harga,qty;
    
        public Pesan(String nama,String gula,Integer harga,Integer qty) {
                this.nama = nama;
                this.gula = gula;
                this.harga = harga;
                this.qty = qty;
                }
    
        public static String getNama() {
            return nama;
        }
    
        public String getGula() {
            return gula;
        }

        public Integer getHarga() {
            return harga;
        }
    
        public Integer getQty() {
            return qty;
        }
    
                
    }
    
