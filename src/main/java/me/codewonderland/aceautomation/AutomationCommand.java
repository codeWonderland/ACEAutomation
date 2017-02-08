package me.codewonderland.aceautomation;

public enum AutomationCommand {
    DIFFUSER_POWER ("KEY_POWER", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_PLAY ("KEY_PLAY", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_LIGHTS ("KEY_BRIGHTNESSUP", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_LIGHT_CYCLE ("KEY_BRIGHTNESS_CYCLE", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_VOLUMEUP ("KEY_VOLUMEUP", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_VOLUMEDOWN ("KEY_VOLUMEDOWN", Automatable.ELLIA_DIFFUSER),
    TELEVISION_POWER ("KEY_POWER", Automatable.DYNEX_TELEVISION);


    private final String lircCommand;

    private final Automatable automatable;

    AutomationCommand(final String lircCommand, final Automatable automatable) {
        this.lircCommand = lircCommand;
        this.automatable = automatable;
    }

    public String getLIRCCommand() {
        return lircCommand;
    }

    public Automatable getAutomatable() {
        return automatable;
    }
}
