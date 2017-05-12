package utils;


import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public enum Json {
    INPUT_1("/json/controller/input/input1.json"),
    INPUT_2("/json/controller/input/input2.json"),
    OUTPUT_1("/json/controller/output/output1.json");

    public final String content;

    Json(String path) {
        content = readJsonFromFile(path);
    }

    private static String readJsonFromFile(String path) {
        try {
            File file = ResourceUtils.getFile(path.getClass().getResource(path));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuilder result = new StringBuilder();
            String line = bufferedReader.readLine();
            while (line != null) {
                result.append(line);
                line = bufferedReader.readLine();
            }
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
