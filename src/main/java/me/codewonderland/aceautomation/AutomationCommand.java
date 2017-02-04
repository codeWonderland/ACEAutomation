package me.codewonderland.aceautomation;

public enum AutomationCommand {
    DIFFUSER_POWER ("KEY_POWER", Automatable.ELLIA_DIFFUSER),
    DIFFUSER_PLAY ("KEY_PLAY", Automatable.ELLIA_DIFFUSER);

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
