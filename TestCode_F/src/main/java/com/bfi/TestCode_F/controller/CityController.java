package com.bfi.TestCode_F.controller;


import com.bfi.TestCode_F.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    CityService cityService;

    @GetMapping
    public List<String> SearchCity(@RequestPart String input) throws IOException {
        return cityService.Search(input);
    }

}
