package gg.druffko.clilib.lib;

public class Formatting {
    private static final String reset = TextStyles.reset;

    public static String bold(String formatString) {
        return TextStyles.bold + formatString + reset;
    }

    public static String italic(String formatString) {
        return TextStyles.italic + formatString + reset;
    }

    public static  String dim(String formatString) {
        return TextStyles.dim + formatString + reset;
    }

    public static String blink(String formatString) {
        return TextStyles.blink + formatString + reset;
    }

    public static String reverse(String formatString) {
        return TextStyles.reverse + formatString + reset;
    }

    public static String invisible(String formatString) {
        return TextStyles.invisible + formatString + reset;
    }
}
