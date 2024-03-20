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

public class ChuyenBayRepo {
    @Entity
    @Table(name = "tbl_chuyenbay")
    public class ChuyenBay{
        @Id
        @GeneratedValue
        private String maCB;

        @Column(name = "GaDi")
        private String gaDi;

        @Column(name = "GaDen")
        private String gaDen;

        @Column(name = "DoDai")
        private int doDai;
        
        @Column(name = "GioDi")
        private Time gioDi;

        @Column(name = "GioDen")
        private Time gioDen;

        @Column(name = "ChiPhi")
        private int chiPhi;
    }

    @Repository
    public interface ChuyenBayDL extends CrudRepository<ChuyenBay,String>{
        List<ChuyenBay> findChuyenBaybyGaDen(String gaDenString);
    }

    public List<ChuyenBay> findChuyenBaybyGaDen(String string) {
        return null;
    }
}
