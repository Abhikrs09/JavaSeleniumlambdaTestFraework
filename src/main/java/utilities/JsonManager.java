package utilities;

import org.json.JSONObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonManager {

    public static JSONObject readJsonFromFile(String filePath) {
        JSONObject jsonObject = null;
        try {
            File file = new File(filePath); // File path passed as argument
            FileReader fileReader = new FileReader(file);
            StringBuilder content = new StringBuilder();
            int i;
            while ((i = fileReader.read()) != -1) {
                content.append((char) i);
            }
            fileReader.close();
            jsonObject = new JSONObject(content.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }



}
