package com.bfi.TestCode_F.service;


import java.io.IOException;
import java.util.List;

public interface CityService {
    List<String> Search(String input) throws IOException;
}
