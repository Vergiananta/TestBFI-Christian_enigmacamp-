package com.bfi.TestCode_F.service.impl;

import com.bfi.TestCode_F.repository.Cityrepository;
import com.bfi.TestCode_F.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    Cityrepository cityrepository;

    @Override
    public List<String> Search(String input) throws IOException {
        return cityrepository.SearchCity(input);
    }
}
