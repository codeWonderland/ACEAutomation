package me.codewonderland.aceautomation;

import org.json.JSONObject;

import java.io.StringWriter;

import static spark.Spark.get;
import static spark.Spark.post;

public class ACEAutomationServer {

    private static boolean diffuserIsOn = false;

    public static void main(String[] args) {

        post("/togglePower", (req, res) -> {
            JSONObject request = new JSONObject(req.body());
            return "success";
        });

        get("/power", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserIsOn", diffuserIsOn);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });
    }

}
