package com.ccrrupt.wynnneu;

public class WynnItem {
    public String name;
    public String icon;
    public String description;
    public int level;

    public WynnItem(String name, String icon, String description, int level) {
        this.name = name;
        this.icon = icon;
        this.description = description;
        this.level = level;
    }

    @Override
    public String toString() {
        return name + " (Lv. " + level + ")";
    }
}
