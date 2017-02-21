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

        get("/televisionInput", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionInputToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_INPUT);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionHDMI", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionHDMIToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_HDMI);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television1", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television1Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_1);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television2", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television2Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_2);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television3", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television3Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_3);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television4", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television4Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_4);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television5", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television5Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_5);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television6", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television6Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_6);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television7", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television7Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_7);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television8", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television8Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_8);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television9", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television9Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_9);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/television0", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("television0Toggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_0);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionInfo", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionInfoToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_INFO);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionMenu", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionMenuToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_MENU);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionUp", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionUpToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_UP);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionDown", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionDownToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_DOWN);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionLeft", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionLeftToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_LEFT);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionRight", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionRightToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_RIGHT);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionExit", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionExitToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_EXIT);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionVolumeUp", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionVolumeUpToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_VOLUMEUP);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionVolumeDown", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionVolumeDownToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_VOLUMEDOWN);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionMute", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionMuteToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_MUTE);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionVideo", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionVideoToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_VIDEO);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionZoom", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionZoomToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_ZOOM);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });

        get("/televisionSleep", (req, res) -> {
            JSONObject response = new JSONObject();
            response.put("televisionSleepToggled", true);

            LIRCManager.sendCommand(AutomationCommand.TELEVISION_SLEEP);

            StringWriter out = new StringWriter();
            response.write(out);

            return out.toString();
        });
        
    }

} 
