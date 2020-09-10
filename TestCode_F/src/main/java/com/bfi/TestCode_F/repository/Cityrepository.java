package com.bfi.TestCode_F.repository;

import java.io.IOException;
import java.util.List;

public interface Cityrepository {
    public List<String> SearchCity(String input) throws IOException;
}
