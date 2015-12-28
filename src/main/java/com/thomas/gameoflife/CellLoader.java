package com.thomas.gameoflife;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author thomas
 */
public class CellLoader {

    public List<Cell> loadCells(String name) throws IOException {
        InputStream resource = getClass().getClassLoader().getResourceAsStream(name);
        String json = IOUtils.toString(resource);

        Type cellListType = new TypeToken<List<Cell>>() {}.getType();
        return new Gson().fromJson(json, cellListType);
    }
}
