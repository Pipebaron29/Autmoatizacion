package org.example.Actions;

import java.util.List;
import java.util.Map;

public class DataTable {

    public List<Map<String, String>> asMap() {
        return this.asMaps(String.class, String.class);
    }

    private List<Map<String, String>> asMaps(Class<String> stringClass, Class<String> stringClass1) {

        return null;
    }
}
