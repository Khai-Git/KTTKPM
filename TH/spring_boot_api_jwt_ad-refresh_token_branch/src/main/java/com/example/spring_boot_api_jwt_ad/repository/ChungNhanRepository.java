package com.example.spring_boot_api_jwt_ad.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class ChungNhanRepository {
    @Entity
    @Table(name = "tbl_chungnhan")
    public class ChungNhan{
        @Id
        @GeneratedValue
        private String maNV;

        @Column(name = "MaMB")
        private int maMB;
    }

    @Repository
    public interface nhanVienHoNguyenRepository extends CrudRepository<ChungNhan,String>{

    }
}
