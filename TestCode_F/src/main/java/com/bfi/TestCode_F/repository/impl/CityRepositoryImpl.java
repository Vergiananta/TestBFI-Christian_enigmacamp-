package com.bfi.TestCode_F.repository.impl;

import com.bfi.TestCode_F.repository.Cityrepository;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import info.debatty.java.stringsimilarity.Levenshtein;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CityRepositoryImpl implements Cityrepository {


    @Override
    public List<String> SearchCity(String input) throws IOException {
        String url = "https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json";
        Levenshtein levenshtein = new Levenshtein();
        URL obj = new URL(url);
        List<String> result = new ArrayList<>();
        URLConnection req = obj.openConnection();
        req.connect();
        JsonParser jsonParser = new JsonParser();
        JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) req.getContent()));
        JsonArray arr = root.getAsJsonArray();
        for (JsonElement element : arr) {
            JsonObject object = element.getAsJsonObject();
            String name = object.get("name").getAsString();

            if (object.get("country").getAsString().equals("ID") && levenshtein.distance(name, input) <= 5.0) {
                result.add(name);
            }
        }
        return result;
    }
}
