package gg.druffko.clilib.lib;

public class TextStyles {
    // Text formatting
    public static final String reset = "\u001B[0m";
    public static final String bold = "\u001B[1m";
    public static final String italic = "\u001B[3m";
    public static final String dim = "\u001B[2m";
    public static final String blink = "\u001B[5m"; // probably buggy...
    public static final String reverse = "\u001B[7m";
    public static final String invisible = "\u001B[8m"; // still able to be copied


    // Text Lines
    public static final String underline = "\u001B[4m";
    public static final String dunderline = "\u001B[21m";
    public static final String cunderline = "\u001B[4:3m";
    public static final String strikethrough = "\u001B[9m";
    public static final String overline = "\u001B[53m";
}
