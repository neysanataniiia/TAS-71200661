package com.rplbo.uasprojectpos;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.*;

public class PointOfSales {
    private ArrayList<Barang> arrBarang = new ArrayList<Barang>();

    public PointOfSales() {}

    public void inputBarang(Barang barang) {this.arrBarang.add(barang);}

    public void tampilDaftarBarang() {
        System.out.println("Kode Barang       Nama Barang               Stok           Harga");
        if(arrBarang.isEmpty()){
            System.out.println("ArrayList kosong..");
        }else{
            for(Barang item : arrBarang) {
                System.out.println(item.getKode() + "             " + item.getNama() +"      " + item.getStok() + "              " + "Rp " + item.getHarga());
            }
        }
    }

    public void checkout(HashMap<Barang, Integer> keranjang, long nominal) {
        long totaltagihan = 0;
        for (Entry<Barang, Integer> item : keranjang.entrySet()){
            totaltagihan += item.getKey().getHarga() *  item.getKey().getStok();
            item.getValue();
            item.getKey().setStok(item.getKey().getStok() - item.getValue());

        }

        System.out.println("Total Tagihan: Rp "+totaltagihan);
        System.out.println("Total Bayar: Rp "+nominal);
        System.out.println("Total Kembalian: Rp "+(nominal - totaltagihan));
    }
}
