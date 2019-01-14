package main.java.aplikasi;

import main.java.aplikasi.config.KoneksiDB;
import main.java.aplikasi.model.Kucing;
import main.java.aplikasi.service.KucingService;

import java.sql.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        KucingService kucingService = new KucingService(KoneksiDB.getDataSource());
        try {
            Kucing kucing = new Kucing();
            kucing.setNama("Johnny1");
            kucing.setJenis("Angora1");
            kucing.setLiar(true);
            kucing.setJumlahKaki(5);
            kucing.setTanggalLahir(new Date());

            kucing = kucingService.save(kucing);
            System.out.println(kucing.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

