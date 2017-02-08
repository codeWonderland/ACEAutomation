package me.codewonderland.aceautomation;

import org.json.JSONObject;

import java.io.StringWriter;

import static spark.Spark.get;

public class ACEAutomationServer {

    public static void main(String[] args) {

        get("/diffuserPower", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserPowerToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_POWER);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/diffuserPlay", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserMusicToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_PLAY);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/diffuserLights", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserLightsToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_LIGHTS);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/diffuserLightCycle", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserLightCycleToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_LIGHT_CYCLE);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/diffuserVolumeUp", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserVolumeUpToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_VOLUMEUP);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/diffuserVolumeDown", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("diffuserVolumeDownToggled", true);

            LIRCManager.sendCommand(AutomationCommand.DIFFUSER_VOLUMEDOWN);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionPower", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionPowerToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_POWER);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

    }

} 
