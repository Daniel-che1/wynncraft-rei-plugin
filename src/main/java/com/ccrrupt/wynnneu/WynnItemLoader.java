package com.ccrrupt.wynnneu;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class WynnItemLoader {
    public static List<WynnItem> load() {
        try {
            InputStreamReader reader = new InputStreamReader(
                WynnItemLoader.class.getClassLoader().getResourceAsStream("wynn_items.json")
            );
            Type listType = new TypeToken<List<WynnItem>>() {}.getType();
            return new Gson().fromJson(reader, listType);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
