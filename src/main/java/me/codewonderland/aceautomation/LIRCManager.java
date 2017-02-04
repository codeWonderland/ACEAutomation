package me.codewonderland.aceautomation;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIRCManager {

    public static void sendCommand(AutomationCommand automationCommand) {
        sendCommand(automationCommand.getLIRCCommand(), automationCommand.getAutomatable().getLircName());
    }

    public static void sendCommand(String lircCommand, String lircName) {
        runBashCommands(Arrays.asList(
                Arrays.asList("sudo", "/etc/init.d/lirc", "start"),
                Arrays.asList("irsend", "SEND_ONCE", lircName, lircCommand),
                Arrays.asList("sudo", "/etc/init.d/lirc", "stop")
        ));
    }

    private static void runBashCommands(List<List<String>> commands) { // TODO return a success bool
        for (List command : commands) {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder(command);

                Process process = processBuilder.start();

                // read command output
                /*
                InputStream is = process.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line;
                System.out.printf("output:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                */

                // wait to get exit value
                try {
                    int exitValue = process.waitFor();
                    //System.out.println("Exit Value is " + exitValue);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
