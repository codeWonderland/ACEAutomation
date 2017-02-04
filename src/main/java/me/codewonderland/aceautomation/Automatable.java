package me.codewonderland.aceautomation;

public enum Automatable {
    ELLIA_DIFFUSER("eliaDiffuser"),
    DYNEX_TELEVISION("dynexTelevision");

    private final String lircName;

    Automatable(final String lircName) {
        this.lircName = lircName;
    }

    public String getLircName() {
        return lircName;
    }
}
