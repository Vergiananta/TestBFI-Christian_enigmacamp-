package com.bfi.TestCode_F.Repository;

import com.bfi.TestCode_F.repository.impl.CityRepositoryImpl;
import com.bfi.TestCode_F.service.CityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.util.HashMap;

@SpringBootTest
public class CityRepository {


   @Test
    void SearchCity() throws IOException {
       CityRepositoryImpl cityrepository = new CityRepositoryImpl();
       HashMap<String, String> tests = new HashMap<String, String>();

       tests.put("pulxu pqnjzng", "Pulau Punjung");

       tests.forEach((original, masked) -> {
           try {
               assertEquals(masked, cityrepository.SearchCity(original));
           } catch (IOException e) {
               System.out.println(e);
           }
       });

   }

}
