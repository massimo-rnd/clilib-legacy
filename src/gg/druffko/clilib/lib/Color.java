package gg.druffko.clilib.lib;

public class Color {
    private static final String reset = TextColors.reset;
    
    public static String black(String colorString) {
        return TextColors.black + colorString + reset;
    }

    public static String red(String colorString) {
        return TextColors.red + colorString + reset;
    }

    public static String green(String colorString) {
        return TextColors.green + colorString + reset;
    }

    public static String yellow(String colorString) {
        return TextColors.yellow + colorString + reset;
    }

    public static String blue(String colorString) {
        return TextColors.blue + colorString + reset;
    }

    public static String purple(String colorString) {
        return TextColors.purple + colorString + reset;
    }

    public static String cyan(String colorString) {
        return TextColors.cyan + colorString + reset;
    }

    public static String white(String colorString) {
        return TextColors.white + colorString + reset;
    }
}
