package com.example.spring_boot_api_jwt_ad.repository;

import java.sql.Time;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class MayBayRepo {
    @Entity
    @Table(name = "tbl_maybay")
    public class MayBay{
        @Id
        @GeneratedValue
        private String maMB;

        @Column(name = "LoaiMB")
        private String loaiMB;

        @Column(name = "TamBay")
        private int tamBay;
    }

    @Repository
    public interface TamBay extends CrudRepository<MayBay,Integer>{
        List<MayBay> findMayBaybyTamBay(int tamBay);
    }
}
