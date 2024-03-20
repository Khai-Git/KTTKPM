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

public class NhanVienRepo {
    @Entity
    @Table(name = "tbl_nhanvien")
    public class NhanVien{
        @Id
        @GeneratedValue
        private String maNV;

        @Column(name = "Ten")
        private String tenNV;

        @Column(name = "Luong")
        private int luongNV;
    }

    @Repository
    public interface LuongNV extends CrudRepository<NhanVien,Integer>{
        List<NhanVien> findNhanVienbyLuong(int luongNV);
    }
}
