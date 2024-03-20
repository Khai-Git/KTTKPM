package com.example.spring_boot_api_jwt_ad.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

public class MayBayRepository {
    @Entity
    @Table(name = "maybay")
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
    public interface TamBayRepository extends CrudRepository<MayBay, Integer>{
        List<MayBay> findMayBaybyTamBay(int tamBayover10000);
    }
}
