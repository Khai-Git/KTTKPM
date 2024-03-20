package com.example.spring_boot_api_jwt_ad.repository;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class NhanVienRepository {
    @Entity
    @Table(name = "tbl_nhanvien")
    public class NhanVien{
        @Id
        @GeneratedValue
        private String maNV;

        @Column(name = "Ten")
        private String ten;

        @Column(name = "Luong")
        private int luong;
    }
    @Repository
    public interface LuongNVRepository extends CrudRepository<NhanVien, Integer>{
        List<NhanVien> findNhanVienbyLuong(int luongUnder10000);
    }
}
