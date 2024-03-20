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

public class ChungNhanRepo {
    @Entity
    @Table(name = "tbl_chungnhan")
    public class ChungNhan{
        @Id
        @GeneratedValue
        private String maNV;

        @Column(name = "MaMB")
        private String maMB;
    }

    @Repository
    public interface ChungNhanr extends CrudRepository<ChungNhan,String>{

    }
}
