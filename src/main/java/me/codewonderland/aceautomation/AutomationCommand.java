package me.codewonderland.aceautomation;

public enum AutomationCommand {
    DIFFUSER_POWER ("KEY_POWER", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_PLAY ("KEY_PLAY", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_LIGHTS ("KEY_BRIGHTNESSUP", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_LIGHT_CYCLE ("KEY_BRIGHTNESS_CYCLE", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_VOLUMEUP ("KEY_VOLUMEUP", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_VOLUMEDOWN ("KEY_VOLUMEDOWN", Automatable.ELLIA_DIFFUSER),
    TELEVISION_POWER ("KEY_POWER", Automatable.DYNEX_TELEVISION),
    TELEVISION_INPUT ("KEY_I", Automatable.DYNEX_TELEVISION),
    TELEVISION_HDMI ("KEY_H", Automatable.DYNEX_TELEVISION),
    TELEVISION_1 ("KEY_1", Automatable.DYNEX_TELEVISION),
    TELEVISION_2 ("KEY_2", Automatable.DYNEX_TELEVISION),
    TELEVISION_3 ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_4 ("KEY_4", Automatable.DYNEX_TELEVISION),
    TELEVISION_5 ("KEY_5", Automatable.DYNEX_TELEVISION),
    TELEVISION_6 ("KEY_6", Automatable.DYNEX_TELEVISION),
    TELEVISION_7 ("KEY_7", Automatable.DYNEX_TELEVISION),
    TELEVISION_8 ("KEY_8", Automatable.DYNEX_TELEVISION),
    TELEVISION_9 ("KEY_9", Automatable.DYNEX_TELEVISION),
    TELEVISION_0 ("KEY_0", Automatable.DYNEX_TELEVISION),
    TELEVISION_INFO ("KEY_INFO", Automatable.DYNEX_TELEVISION),
    TELEVISION_MENU ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_UP ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_DOWN ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_LEFT ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_RIGHT ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_EXIT ("KEY_3", Automatable.DYNEX_TELEVISION),
    TELEVISION_VOLUMEUP ("KEY_VOLUMEUP", Automatable.DYNEX_TELEVISION),
    TELEVISION_VOLUMEDOWN ("KEY_VOLUMEDOWN", Automatable.DYNEX_TELEVISION),
    TELEVISION_MUTE ("KEY_MUTE", Automatable.DYNEX_TELEVISION),
    TELEVISION_VIDEO ("KEY_VIDEO", Automatable.DYNEX_TELEVISION),
    TELEVISION_ZOOM ("KEY_ZOOM", Automatable.DYNEX_TELEVISION),
    TELEVISION_SLEEP ("KEY_SLEEP", Automatable.DYNEX_TELEVISION);


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
