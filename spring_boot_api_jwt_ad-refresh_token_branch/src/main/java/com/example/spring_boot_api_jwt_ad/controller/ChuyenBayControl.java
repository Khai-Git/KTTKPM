package com.example.spring_boot_api_jwt_ad.controller;

import java.util.List;

import com.example.spring_boot_api_jwt_ad.repository.ChuyenBayRepo;
import com.example.spring_boot_api_jwt_ad.repository.ChuyenBayRepo.ChuyenBay;

public class ChuyenBayControl {

    ChuyenBayRepo chuyenBayRepo;

    public List<ChuyenBay> diemDenDalat(){
        return chuyenBayRepo.findChuyenBaybyGaDen("DAD");
    }
}
