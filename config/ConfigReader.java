package minechemreborn.config;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ConfigReader {
    public static String enableVanillaCrafting;
    public static String enableAllChemicals;

    public static void init() {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader(
                    "/config/maxdistructo/minechemreborn/config.json"));

            JSONObject jsonObject = (JSONObject) obj;

            enableAllChemicals = (String) jsonObject.get("enableAllChemicals");
            enableVanillaCrafting = (String) jsonObject.get("enableVanillaCrafting");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
