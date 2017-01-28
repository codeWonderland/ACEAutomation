package me.codewonderland.aceutomation;

import org.json.JSONObject;

import static spark.Spark.post;

public class ACEAutomationServer {

    public static void main(String[] args) {
        post("/power", (req, res) -> {
            JSONObject request = new JSONObject(req.body());
            return "success";
        });
    }

}
